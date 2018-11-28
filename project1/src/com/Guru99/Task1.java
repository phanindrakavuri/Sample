package com.Guru99;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
public static String alphabetical_Order(LinkedList<String> product_Names)
{
	String previous ="";
	for (final String current:product_Names)
	{
		if (current.compareTo(previous) < 0)
		{
			return current;
		}
		previous = current;
		
		
	}
	return previous;
}
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\shiva\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("http://live.guru99.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.titleContains("Home page"));
		String hptitle=driver.getTitle();
		System.out.println(hptitle);
		
		if (hptitle.equalsIgnoreCase("Home page"))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title not matched and the Ecpected title is "+hptitle );
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mobile=driver.findElement(By.xpath("//*[text()='Mobile']"));
		wait.until(ExpectedConditions.elementToBeClickable(mobile));
		mobile.click();
		
		wait.until(ExpectedConditions.titleContains("Mobile"));
		String mtitle = driver.getTitle();
		System.out.println(mtitle);
		if(mtitle.equalsIgnoreCase("Mobile"))
		{
			System.out.println("title matched");
		}
		else
		{
			System.out.println("title doesnot matched");
		}
		Select s=new Select(driver.findElement(By.xpath("(//*[@title='Sort By'])[1]")));
		s.selectByVisibleText("Name");
		
		List<WebElement> l=driver.findElements(By.xpath("//*[contains(@id,'product-collection-image')]"));
		LinkedList<String> product_Names = new LinkedList();
		for (int i=0;i<l.size();i++)
		{
			String s1=l.get(i).getAttribute("alt");
			product_Names.add(s1);
			String result = alphabetical_Order(product_Names);
			System.out.println(result);
		}
		
		driver.close();
	}

}
