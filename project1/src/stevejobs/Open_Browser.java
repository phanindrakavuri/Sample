package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Open_Browser
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("kalam");     
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
	}
}




