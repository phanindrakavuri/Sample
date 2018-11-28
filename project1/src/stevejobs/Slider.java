package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Slider
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver",
		           "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://jqueryui.com/slider");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//goto frame
		driver.switchTo().frame(0);
		//Automate horizontal slider
		WebElement e1=driver.findElement(By.xpath(
				            "//*[@id='slider']/span"));
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		Actions a=new Actions(driver);
		//Horizontal slider from left to right
		a.dragAndDropBy(e1,x1+100,y1).build().perform();
		Thread.sleep(5000);
		//Horizontal slider from right to left
		a.dragAndDropBy(e1,x1-100,y1).build().perform();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//Click link
		driver.findElement(By.linkText("Vertical slider"))
													.click();
		Thread.sleep(5000);
		//goto frame
		driver.switchTo().frame(0);
		//Automate vertical slider
		WebElement e2=driver.findElement(By.xpath(
				         "//*[@id='slider-vertical']/span"));
		int x2=e2.getLocation().getX();
		int y2=e2.getLocation().getY();
		//Vertical slider from top to bottom
		a.dragAndDropBy(e2,x2,y2+100).build().perform();
		Thread.sleep(5000);
		//Vertical slider from bottom to top
		a.dragAndDropBy(e2,x2,y2-200).build().perform();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}




