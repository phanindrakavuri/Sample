package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test10
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
		String x=driver.findElement(By.name("username"))
									.getAttribute("maxlength");
		System.out.println(x);
		String y=driver.findElement(By.name("username"))
				              .getCssValue("vertical-align");
		System.out.println(y);
		driver.close();
	}

}




