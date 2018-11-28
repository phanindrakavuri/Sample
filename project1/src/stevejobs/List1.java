package stevejobs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class List1
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Collect all elements
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println("Count of all elements is :"+l.size());
		driver.close();
	}

}






