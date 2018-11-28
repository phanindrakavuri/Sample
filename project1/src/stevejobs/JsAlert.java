package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlert 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get(
			"https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get invisible items from multi-select drop-doun(div)
		List<WebElement> l=driver.findElements(By.xpath("(//*[contains(@class,'dropdown selection multiple')])[1]/div[2]/div"));
		System.out.println(l.size());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<l.size();i++)
		{
			js.executeScript(
				"var x=arguments[0].textContent; alert(x);",
				l.get(i));
			String y=driver.switchTo().alert().getText();
			System.out.println(y);
			driver.switchTo().alert().dismiss();
		}
		driver.close();
	}
}





