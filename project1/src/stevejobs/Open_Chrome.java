package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Open_Chrome
{
	public static void main(String[] args) throws Exception
	{
		//Run chromedriver.exe to get chrome browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		//create object to access chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdul kalam");
		driver.close();
	}
}




