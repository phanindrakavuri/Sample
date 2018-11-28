package stevejobs;
import java.net.URL;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class Test66 
{
	public static void main(String[] args) throws Exception
	{
		//Start appium server
		Runtime.getRuntime().exec(
		 "cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		//Get appium server address
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//Provide device and app details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage",
					     "com.android.calculator2");
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
		//App automation
		try
		{
			Thread.sleep(10000);
			String x=driver.getOrientation().name();
			System.out.println(x);
			if(x.equals("PORTRAIT"))
			{
				driver.rotate(ScreenOrientation.LANDSCAPE);
			}
			else
			{
				driver.rotate(ScreenOrientation.PORTRAIT);
			}
			Thread.sleep(10000);
			driver.lockDevice();
			Thread.sleep(10000);
			if(driver.isLocked())
			{
				System.out.println("Locked");
				driver.unlockDevice();
			}
			//close app
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
