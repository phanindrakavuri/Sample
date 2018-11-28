package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Scroll
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Scroll from top to bottom
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(10000);
		//Scroll from bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(10000);
		//Scroll to specific element
		WebElement e=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
		js.executeScript("arguments[0].scrollIntoView();",e);
	}

}





