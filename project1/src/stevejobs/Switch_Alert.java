package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Switch_Alert 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		String x=driver.switchTo().alert().getText();
		System.out.println(x);
		driver.switchTo().alert().dismiss();
	}
}





