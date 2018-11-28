package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Send 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("90909090");

	}

}
