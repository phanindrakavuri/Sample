package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Enable
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver","E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//validation for visibility
		if(driver.findElement(By.name("q")).isDisplayed())
		{
			System.out.println("Diplayed");
		}
		else
		{
			System.out.println("Not Diplayed");
		}
		//Validation for operatable
		if(driver.findElement(By.name("q")).isEnabled())
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		//Validation for focus
		if(driver.findElement(By.name("q")).isSelected())
		{
			System.out.println("Focused now");
		}
		else
		{
			System.out.println("No focus on element");
		}
		//Close site
		driver.close();
	}

}




