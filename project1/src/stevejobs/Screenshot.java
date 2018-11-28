package stevejobs;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Screenshot
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"D:\\shiva\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		driver.manage().timeouts()
		           .implicitlyWait(10,TimeUnit.SECONDS);
		File src=((ChromeDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("ss.png");
		FileUtils.copyFile(src,dest);
	}
}




