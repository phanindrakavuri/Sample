package stevejobs;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class Appium_Real_Contacts
{
	public static void main(String[] args) throws Exception
	{
		//Get mobile number to dial
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
		String x=sc.nextLine();
		//Start appium server
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
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity",
				"com.android.contacts.activities.DialtactsActivity");
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
		//App automation
		try
		{
			//Automate app screen elements
			driver.manage().timeouts().implicitlyWait(100,
					                              TimeUnit.SECONDS);
			//Dail a number and click video call
			for(int i=0;i<x.length();i++)
			{
				char y=x.charAt(i);
				driver.findElement(By.xpath("//*[@text='"+y+"']"))
				                                         .click();
			}
			driver.findElement(By.xpath(
					"//*[@content-desc='Video Call']")).click();
			//wait few seconds
			Thread.sleep(5000);
			//Click end call in video screen(Dynamic screen) 
			driver.findElementByAndroidUIAutomator(
					"new UiSelector().text(\"End\")").click();
			Thread.sleep(5000);
			driver.closeApp();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//Stop Appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");	
	}
}
