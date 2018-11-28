package stevejobs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ApppiumSearch
{
	public static void main(String[] args) throws Exception
	{
		//Start appium server programmatically
		Runtime.getRuntime().exec(
		 "cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		//Get address of appium server
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//Provide device and app details				
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","LGM7008bb8d686");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("appPackage","com.android.mms");
		dc.setCapability("appActivity",
				"com.android.mms.ui.ConversationList");
		//Create driver object to launch app in device
		AndroidDriver driver;
		while(2>1) //infinite loop
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break; //terminate from loop
			}
			catch(Exception e)
			{	
			}
		}
		//Automate app screen elements
		try
		{
			driver.manage().timeouts().implicitlyWait(100,
					                        TimeUnit.SECONDS);
			driver.findElement(By.xpath(
					"//*[@content-desc='More options']")).click();
			driver.findElement(By.xpath("//*[@text='Search']"))
														.click();
			if(driver.isKeyboardShown())
			{
				driver.hideKeyboard();
			}
			else
			{
				System.out.println("No keyboard, try to get");
				driver.getKeyboard();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//Stop appium server programmatically
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");       
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}
}
