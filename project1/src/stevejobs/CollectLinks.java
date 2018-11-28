package stevejobs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CollectLinks
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.mercurytravels.co.in");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Collect all links
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		System.out.println("Count of all links is "+l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		//Close site
		driver.close();
	}
}






