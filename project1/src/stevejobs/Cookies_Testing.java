package stevejobs;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Cookies_Testing
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Delete all existing cookies
		driver.manage().deleteAllCookies();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Cookies testing
		if(driver.manage().getCookies().size()!=0)              
		{
			System.out.println("Cookies were loaded");
		}
		else
		{
			System.out.println("Cookies were not loaded");
		}
		//Close site
		driver.close();
	}
}
