package stevejobs;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test112
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
		//Get all mails in mailbox table
		List<WebElement> mails=driver.findElements(By.xpath(
		"(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr"));
		int urc=0;
		int rc=0;
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
				System.out.println(z[2]); //3rd piece is mail subject
				urc=urc+1;
			}
			else
			{
				System.out.println(z[1]); //2nd piece is mail subject
				rc=rc+1;
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
