package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Secure_Not
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();                        
		if(x.contains("https"))
		{
			System.out.println("Secured");
		}
		else
		{
			System.out.println("Not secured");
		}
		//Close site
		driver.close();

	}

}
