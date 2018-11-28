package stevejobs;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StringSelection1
{
	public static void main(String[] args) throws Exception									 
	{
		//Open browser(SWD)
		System.setProperty("webdriver.chrome.driver",
                        "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site(SWD)
		driver.get("http://www.gmail.com");
		//Wait and Maximize(SWD)
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.
		   visibilityOfElementLocated(By.name("identifier")));
		driver.manage().window().maximize();
		//Do login(SWD)
		driver.manage().timeouts().implicitlyWait(10,
				TimeUnit.SECONDS);
		driver.findElement(By.name("identifier"))
		                      .sendKeys("abcmtestemail");
		driver.findElement(By.id("identifierNext")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(
				                          By.name("password")));     
		driver.findElement(By.name("password")).sendKeys("testadmin");
		
		driver.findElement(By.id("passwordNext")).click();
		//Click Compose and fill fields(SWD)
		driver.findElement(By.xpath("//*[text()='COMPOSE']"))
		                                           .click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		driver.findElement(By.name("to"))
		                      .sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("subjectbox"))
		                      .sendKeys("Promise");
		driver.findElement(By.xpath(
				"(//*[@aria-label='Message Body'])[2]"))
			.sendKeys("Hi sir,\nHow are you in haven");
		driver.findElement(By.xpath(
		 "//*[@aria-label='Attach files']/descendant::div[3]"))
		                                      .click();
		//Handle file upload window(Java Robot)
		Thread.sleep(5000);
		StringSelection x=new StringSelection( "C:\\Users\\Public\\Pictures\\Sample Pictures\\tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard()
		                               .setContents(x,null);
		Robot r=new Robot();
		if(System.getProperty("os.name").contains("Windows"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(System.getProperty("os.name").contains("Mac"))
		{
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_META);
		}
		else if(System.getProperty("os.name")
				                           .contains("Linux"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		else
		{
			System.out.println("Unknown OS");
			System.exit(0); //Stop execution forcibly
		}
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Send mail(SWD)
		driver.findElement(By.xpath("//*[text()='Send']"))
		                                           .click();
		//Wait and get message
		w.until(ExpectedConditions.visibilityOfElementLocated(
			 By.xpath(
		   "//*[contains(text(),'Your message has been sent')]"
			)));
		String m=driver.findElement(By.xpath(
		 "//*[contains(text(),'Your message has been sent')]"))
				.getText();
		System.out.println(m);
		//Do logout(SWD)
		driver.findElement(By.xpath(
		     "//*[@aria-label='Account Information']/preceding::*[3]")).click();
		driver.findElement(By.linkText("Sign out")).click();
		//Close site
		driver.close();
		
		
		
		
		
				                

	}

}
