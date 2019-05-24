package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Apsrtc {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://apsrtconline.in");
		WebElement e = driver.findElement(By.id("fromPlaceName"));
		Actions action = new Actions(driver);
		action.sendKeys(e, "hyd").build().perform();
		Thread.sleep(2000);
		action.sendKeys(e, Keys.ENTER).build().perform();
	}

}
