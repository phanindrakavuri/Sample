package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test11
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier"))
		                      .sendKeys("batch238sleepers");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath(
				"(//*[@aria-live='assertive'])[1]"))
				.getAttribute("value");
		System.out.println(x);
	}
}





