package stevejobs;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test117 
{
	public static void main(String[] args) throws Exception
	{
		//Launch site
		System.setProperty("webdriver.gecko.driver",
				"E:\\batch239\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts()
		                 .implicitlyWait(100,TimeUnit.SECONDS);
		//Do login
		driver.findElement(By.name("identifier"))
		                         .sendKeys("abcmtestemail");
		driver.findElement(By.xpath("//*[text()='Next']"))
		                                          .click();
		Thread.sleep(5000);
		driver.findElement(By.name("password"))
		                             .sendKeys("testadmin");
		driver.findElement(By.xpath("//*[text()='Next']"))
		                                          .click();
		Thread.sleep(5000);
		//Pagination
		int urc=0;
		int rc=0;
		while(2>1) //infinite loop
		{
			//Get all mails in mailbox table
			List<WebElement> mails=driver.findElements(By.xpath(
			"(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr"));
			for(int i=1;i<=mails.size();i++)
			{
				WebElement e=driver.findElement(By.xpath(
						"(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr["+i+"]/td[4]/div[1]"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript(
					"var x=arguments[0].textContent; alert(x);",e);
				Thread.sleep(2000);
				String y=driver.switchTo().alert().getText();
				driver.switchTo().alert().dismiss();
				String z[]=y.split(",");
				if(z[0].contains("unread"))
				{
					urc=urc+1;
				}
				else
				{
					rc=rc+1;
				}
			}
			//Go next page in mailbox
			try
			{
				if(driver.findElement(By.xpath(
						"//*[@aria-label='Older']")).getAttribute(
						"aria-disabled").equals("true"))
				{
					break; //terminate from loop
				}
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath(
						"//*[@aria-label='Older']")).click();
				Thread.sleep(5000);
			}
		}
		
		
		System.out.println("Unread mails count is "+urc);
		System.out.println("Read mails count is "+rc);
		//Do logout
		driver.findElement(By.xpath(
		 "//*[@aria-label='Account Information']/preceding::span[1]"))
		                                              .click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
