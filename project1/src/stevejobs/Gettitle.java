package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettitle 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver",
				"E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();
		

	}

}
