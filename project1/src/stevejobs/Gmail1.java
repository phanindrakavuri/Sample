package stevejobs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1
{
	public static void main(String[] args) throws Exception
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver","D:\\shiva\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site in that browser
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Enter user-id and click next
		driver.findElement(By.name("identifier")).sendKeys("abcmtestemail");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("testadmin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(10000);
		//select checkbox in 2nd col in 2nd row via collections
		List<WebElement> rl=driver.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr"));
		System.out.println(rl.size()); 
		List<WebElement> cl=rl.get(1).findElements(By.tagName("td"));
		System.out.println(cl.size());
		List<WebElement> el=cl.get(1).findElements(By.tagName("div"));
		el.get(0).click();
		//Select checkbox in 2nd col in 3rd row via direct xpath
		driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[3]/td[2]/div")).click();
		Thread.sleep(5000);
		//Do logout
		driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
