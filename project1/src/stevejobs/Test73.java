package stevejobs;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;
public class Test73
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
		dc.setCapability("appPackage","com.samsung.android.contacts");
		dc.setCapability("appActivity",
				              "com.android.dialer.DialtactsActivity");
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
		driver.manage().timeouts().implicitlyWait(20,
				                                  TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='RECENTS']")).click();
		driver.findElement(By.xpath(
				"(//*[@class='android.view.ViewGroup'])[1]")).click();
		driver.findElement(By.xpath("//*[@text='Call']")).click();
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@content-desc='End call']")));
		//Get screenshot because toasted msg is in app screen
		File src=((TakesScreenshot)driver).getScreenshotAs(
				                                   OutputType.FILE);
		File dest=new File("E:\\batch238\\ss.png");
		FileUtils.copyFile(src,dest);
		driver.findElement(By.xpath("//*[@content-desc='End call']"))
															.click();
		//Apply OCR technique to get text in screenshot image
		File f=new File("E:\\batch238\\ss.png"); 
		File fo=LoadLibs.extractTessResources("tessdata");  
		Tesseract obj=new Tesseract();
		obj.setDatapath(fo.getAbsolutePath());
		String result=obj.doOCR(f);
		Thread.sleep(20000);
		//Validate toasted msg
		if(result.contains("Conditional call"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//close app
		driver.closeApp();
		//Stop appium server programmatically
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");       
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");	
	}
}





