package stevejobs;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test93
{
	public static void main(String[] args) throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//Launch site
		System.setProperty("webdriver.gecko.driver",
				"E://batch238//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		//wait until page is ready
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(
				                                By.name("q")));
		//Maximize browser window
		driver.manage().window().maximize();
		//Define implicit wait for find element
		driver.manage().timeouts()
		                    .implicitlyWait(10,TimeUnit.SECONDS);
		//Fill text-box
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		//Wait until next page is ready
		w.until(ExpectedConditions.visibilityOfElementLocated(
				             By.xpath("//*[text()='All']")));
		//Title testing
		String t=driver.getTitle();
		if(t.contains(x))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("E:\\batch238\\screen.png");
			FileUtils.copyFile(src, dest);
		}
		//Close site
		driver.close();
	}
}




