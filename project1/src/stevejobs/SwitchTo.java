package stevejobs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Click on google play store
		driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(5000);
		//Get multiple browser window handles
		ArrayList<String> whs=
			new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<whs.size();i++)
		{
			System.out.println(whs.get(i));
		}
		//Switch to 2nd browser window/tab
		driver.switchTo().window(whs.get(1));
		Thread.sleep(5000);
		driver.close();
		//Back to 1st browser window/tab
		driver.switchTo().window(whs.get(0));
		//Do login
		driver.findElement(By.name("username")).sendKeys("9505303102");    
		driver.findElement(By.name("password")).sendKeys("8096sms");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		//close 1st browser window/tab
		driver.close();
	}

}
