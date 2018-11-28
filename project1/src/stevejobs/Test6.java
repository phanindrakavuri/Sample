package stevejobs;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sun.glass.events.KeyEvent;
public class Test6
{
	public static void main(String[] args) throws Exception
	{
		//Run browser driver to get browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get(
				"http://site21.way2sms.com/content/index.html");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(
				                        By.name("username")));
		driver.manage().window().maximize();
		//Do login
		driver.manage().timeouts().implicitlyWait(10,
				                              TimeUnit.SECONDS);
		driver.findElement(By.name("username"))
		                               .sendKeys("9505303102");
		driver.findElement(By.name("password"))
		                              .sendKeys("8096sms");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//*[text()='Send SMS']"))
													.click();
		w.until(ExpectedConditions.
				      frameToBeAvailableAndSwitchToIt("frame"));
		driver.findElement(By.name("mobile"))
		                                .sendKeys("9066168089");
		driver.findElement(By.name("message"))
		             .sendKeys("Special status to sleep in CR");
		driver.findElement(By.name("Send")).click();
		driver.switchTo().defaultContent();
		if(driver.findElement(By.xpath(
		  "//*[text()='Install Chrome Plugin']")).isDisplayed())
		{
			driver.findElement(By.xpath(
				"//*[text()='Install Chrome Plugin']")).click();
			Thread.sleep(5000);
			Robot r=new Robot();
			for(int i=1;i<=2;i++)
			{
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
		}
		driver.switchTo().frame("frame");
		try
		{
			if(driver.findElement(By.xpath(
		 "//*[@class='ssms consuki']/following-sibling::span"))
					                       .isDisplayed())
			{
			System.out.println("Message was sent successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println("Message send was failed");
		}
		//Do logout
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='out louti']"))
		                                              .click();
		w.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("username")));
		driver.close();
	}
}






