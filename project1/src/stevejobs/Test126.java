package stevejobs;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Test126
{
	public static void main(String[] args) throws Exception
	{
		URL u=new URL("http://192.168.1.2:5566/wd/hub");             
		FirefoxOptions dc=new FirefoxOptions();
		WebDriver driver=new RemoteWebDriver(u,dc);
		driver.get("http://www.google.co.in");
		driver.quit();
	}
}








