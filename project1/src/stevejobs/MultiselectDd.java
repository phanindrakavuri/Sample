package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiselectDd 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver",
		           "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get(
			"https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click on multi-select drop-doun(div tag)
		WebElement e=driver.findElement(By.xpath(
		 "//*[@class='ui fluid dropdown selection multiple']"));
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		//Collect all items in that drop-down
		List<WebElement> il=driver.findElements(By.xpath(
			"//*[@class='menu transition visible']/div"));
		System.out.println("All items count is "+il.size());
		//Display all items
		for(int i=0;i<il.size();i++)
		{
			System.out.println(il.get(i).getText());
		}
		//Select required items
		a.sendKeys("a").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys("c").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		//Get count and display selected items
		List<WebElement> sil=driver.findElements(By.xpath(
		  "//*[contains(@class,'selection multiple upward')]/child::a"));
		System.out.println(
				"Selected items count is "+sil.size());
		for(int i=0;i<sil.size();i++)
		{
			System.out.println(sil.get(i).getText());
		}
		Thread.sleep(5000);
		//Deselect 1st item
		driver.findElement(By.xpath(
			"//*[contains(@class,'selection multiple upward')]/child::a[1]/child::*")).click();
		Thread.sleep(5000);
			
		//Close site
		driver.close();

	}

}




