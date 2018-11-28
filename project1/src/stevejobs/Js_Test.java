package stevejobs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Js_Test 
{

	public static void main(String[] args)
	{
		//Get a value from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		String x=sc.nextLine();
		//Open browser
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://angularjs.org/");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement e=driver.findElement(By.xpath("//*[@ng-model='yourName']"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		String y=driver.findElement(By.xpath("(//*[contains(text(),'build this app')])[1]/preceding::*[1]")).getText();
		if(y.contains(x))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//Close site
		driver.close();
	}
}
