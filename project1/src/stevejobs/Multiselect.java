package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Multiselect
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver",
		           "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Multi-select
		driver.switchTo().frame("iframeResult");//to frame
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		int x=s.getOptions().size();
		System.out.println("Total count of items is "+x);
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		a.click(s.getOptions().get(2)).build().perform();
		a.click(s.getOptions().get(3)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(10000);
		int y=s.getAllSelectedOptions().size();
		System.out.println("Selected items count is "+y);
		String z=s.getFirstSelectedOption().getText();
		System.out.println(z);
		driver.close();
	}
}
