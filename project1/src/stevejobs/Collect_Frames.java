package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collect_Frames 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Collect frames
		List<WebElement> l=driver.findElements(
				                     By.xpath("//iframe"));
		if(l.size()>0)
		{
			System.out.println("Frame are available");
		}
		else
		{
			System.out.println("No frames in page");
		}
		
		
		
		
		
		
		
		//Close site
		driver.close();

	}

}
