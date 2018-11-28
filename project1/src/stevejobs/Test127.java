package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test127 extends Thread
{
		public void run()
		{
			//Open browser
			System.setProperty("webdriver.chrome.driver",
					      "E:\\batch238\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//Launch site
			driver.get("http://www.google.co.in");
			driver.close();
		}
		public static void main(String[] args) 
				                           throws Exception
		{
			Test127 obj=new Test127();
			obj.start();
			//Open browser
			System.setProperty("webdriver.chrome.driver",
					         "E:\\batch238\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//Launch site
			driver.get("http://www.google.co.in");
			Thread.sleep(5000);
			
			driver.findElement(By.name("q")).sendKeys("kalam",
					                                 Keys.ENTER);
			Thread.sleep(5000);
			driver.close();
		}
	}

