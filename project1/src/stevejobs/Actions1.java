package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver",
		           "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//close banner
		driver.findElement(By.xpath("//*[@id='container']/following::button[1]")).click();
		Thread.sleep(5000);
		//Move mouse pointer to element
		WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
	}
}
