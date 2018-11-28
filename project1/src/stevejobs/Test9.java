package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
					"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get(
				"http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
		  "//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(5000);
		//Close Browser windows(tabs)
		driver.quit();


	}

}
