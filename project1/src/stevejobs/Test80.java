package stevejobs;
import java.net.URL;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.android.AndroidDriver;
public class Test80
{
	public static void main(String[] args) throws Exception
	{
		//Get platform
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter platform");
		String p=sc.nextLine();
		WebDriver driver=null;
		if(p.equalsIgnoreCase("computer"))
		{
			System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			//Start appium server
			Runtime.getRuntime().exec(
			"cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
			//Get address of appium server
			URL u=new URL("http://0.0.0.0:4723/wd/hub");
			//Provide device and app details
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
			dc.setCapability("deviceName","4200e6519aac84b9");
			dc.setCapability("platformName","android");
			dc.setCapability("platformVersion","7.1.1");
			//Create driver object to launch chrome browse in device
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
		}
		//Launch site
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(5000);
		//Click Register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("firstName"))
		                                  .sendKeys("abdul");
		driver.findElement(By.name("lastName"))
		         .sendKeys("kalam",Keys.TAB,"9999988845");
		driver.findElement(By.name("userName"))
		                      .sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("address1"))
									.sendKeys("Mosqe street");
		driver.findElement(By.name("address2"))
								.sendKeys("Dhanushkoti road");
		driver.findElement(By.name("city"))
									.sendKeys("Rameshwaram");
		driver.findElement(By.name("state"))
		                              .sendKeys("Tamilnadu");
		driver.findElement(By.name("postalCode"))
										.sendKeys("65678");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		driver.findElement(By.name("email"))
									.sendKeys("apjkalam11");
		driver.findElement(By.name("password"))
								.sendKeys("batch238sixpack");
		driver.findElement(By.name("confirmPassword"))
					.sendKeys("batch238sixpack");
		driver.findElement(By.name("register")).click();
		//Close site
		driver.close();
		if(!p.equalsIgnoreCase("computer"))
		{
			//Stop Appium server
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		}

	}

}
