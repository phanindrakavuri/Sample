package stevejobs;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_tip
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//get tool-tip of text-box
		WebElement e1=driver.findElement(By.name("q"));
		String x=e1.getAttribute("title");
		System.out.println(x);
		//Get tool-tip of icon
		WebElement e2=driver.findElement(By.xpath("//*[@class='gsri_a']/parent::*"));
		String y=e2.getAttribute("aria-label");
		System.out.println(y);
		driver.close();
	}

}
