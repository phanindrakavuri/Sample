package stevejobs;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Appiumcal
{
	public static void main(String[] args) throws Exception
	{
		//Start appium server
		Runtime.getRuntime().exec(
		 "cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		//Get address of appium server
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//Provide device and app details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity",
				            "com.android.calculator2.Calculator");
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
		try
		{
			//Automate app screen elements
			driver.manage().timeouts().implicitlyWait(100,
												TimeUnit.SECONDS);
			String x=driver.getCurrentPackage();
			System.out.println(x);
			String y=driver.currentActivity();
			System.out.println(y);
			//Send app to background for 10 seconds
			Duration d=Duration.of(10, ChronoUnit.SECONDS);
			driver.runAppInBackground(d);
			Thread.sleep(10000);
			//Goto Home
			driver.pressKeyCode(AndroidKeyCode.HOME);
			Thread.sleep(10000);
			//Activate calculator 
			driver.launchApp();  //calculator will back to display
			Thread.sleep(10000);
			//Operate an element and Reset app
			driver.findElement(By.xpath("//*[@text='9']")).click();
			Thread.sleep(5000);
			driver.resetApp(); //reload calculator app
			Thread.sleep(10000);
			//close app
			driver.closeApp();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//Stop and Close Appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");	
	
	}

}

	
	
	
	
	