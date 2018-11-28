package stevejobs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Test79
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
		dc.setCapability("deviceName","4200e6519aac84b9");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability("appPackage","com.whatsapp");
		dc.setCapability("appActivity","com.whatsapp.Main");
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
		driver.manage().timeouts().implicitlyWait(10,
				                                   TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				        "//*[@text='AGREE AND CONTINUE']")).click();
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		driver.findElement(By.xpath("//*[@text='phone number']"))
		                                    .sendKeys("9090909090");
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		driver.closeApp();
		//Stop Appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
