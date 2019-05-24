package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args) throws Exception {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Launch site
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// goto frame
		driver.switchTo().frame(0);
		// Perform drag and drop
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(e1, e2).build().perform();
		// Back to page
		driver.switchTo().defaultContent();
		// close site
		driver.close();
	}
}
