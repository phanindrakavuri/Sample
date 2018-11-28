package stevejobs;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actions2
{
	public static void main(String[] args) throws Exception
	{
		//Open browser(SWD)
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site(SWD)
		driver.get("http://www.seleniumhq.org");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.
		   visibilityOfElementLocated(By.linkText("Download")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Right click on element(SWD)
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.linkText("Download"));
		a.contextClick(e).build().perform();
		//Select 2nd option in Win-menu(Java Robot)
		Robot r=new Robot();
		for(int i=1;i<=2;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(5000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Close site(SWD)
		driver.quit();
	}
}






