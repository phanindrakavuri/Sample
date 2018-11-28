package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselect
{
	public static void main(String[] args) throws Exception
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site in that browser
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Validate drop-down as single select/multi-select
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("Multi-select drop-down");
		}
		else
		{
			System.out.println("Single-select drop-down");
		}
		Thread.sleep(5000);
		int c=s.getOptions().size();
		System.out.println("Count of items in drop-down is "+c);
		Thread.sleep(5000);
		for(int i=0;i<c;i++)
		{
			String x=s.getOptions().get(i).getText();
			System.out.println(x);
		}
		Thread.sleep(5000);
		s.selectByVisibleText("2Nights+3Days");
		Thread.sleep(5000);
		s.selectByIndex(3);
		Thread.sleep(5000);
		s.selectByValue("2Nights / 3Days");
		//Close site
		//driver.close();
	}
}





