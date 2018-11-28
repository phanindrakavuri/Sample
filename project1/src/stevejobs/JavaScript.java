package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Do login
		WebElement e=driver.findElement(By.name("identifier"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px dotted blue';",e);
		js.executeScript("arguments[0].value='mindq';",e);
		Thread.sleep(5000);
		js.executeScript("document.getElementById('identifierNext').click();");
	}

}




