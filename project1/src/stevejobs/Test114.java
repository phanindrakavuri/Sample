package stevejobs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test114
{
	public static void main(String[] args) throws Exception
	{
		//Get word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//Launch site
		System.setProperty("webdriver.gecko.driver",
				"E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts()
		                 .implicitlyWait(10,TimeUnit.SECONDS);
		//Search a word
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		Thread.sleep(5000);
		int flag=0;
		while(2>1) //infinite loop
		{
			String y=driver.getTitle();
			if(!y.contains(x))
			{
				flag=1;
				break; //terminate from loop
			}
			//Goto next page
			try
			{
				if(driver.findElement(By.xpath(
						"//*[text()='Next']")).isDisplayed())
				{
					driver.findElement(By.xpath(
							"//*[text()='Next']")).click();
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				break; //terminate loop
			}	
		}
		if(flag==0)
		{
			System.out.println("Title test was passed");
		}
		else
		{
			System.out.println("Title test was failed");
		}
		//Close site
		driver.close();
	}
}



