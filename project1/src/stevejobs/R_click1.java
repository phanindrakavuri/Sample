package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class R_click1 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver",
		           "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Right click on an element in page
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e,"kalam").build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
	}
}
