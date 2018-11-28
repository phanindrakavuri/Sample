package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test118
{
	public static void main(String[] args)
	{
		//Launch site
		System.setProperty("webdriver.gecko.driver",
				"E:\\batch239\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts()
		               .implicitlyWait(100,TimeUnit.SECONDS);
		List<WebElement> l=driver.findElements(By.tagName("a"));
		for(WebElement x:l)
		{
			System.out.println(x.getText());
		}
		driver.close();

	}

}
