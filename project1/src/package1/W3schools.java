package package1;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W3schools {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
		driver.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'JS Where To')]")));
        driver.findElement(By.xpath("//*[contains(text(),'JS Where To')]")).click();
		
        driver.findElement(By.xpath("(//*[contains(text(),'Try it Yourself »')])[7]")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        String parentwindow=driver.getWindowHandle().toString();
       
        for(String windows:windowhandles)
        {
        	System.out.println(windows.toString());
        	if(windows!=parentwindow)
        	{
        	driver.switchTo().window(windows);
        	}
        }
                
        
        final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of frames in webpage :"+iframes.size());
      
        
        
        for (WebElement iframe : iframes) {
            if (iframe.getAttribute("id").equals("iframeResult")) {
            // TODO your stuff.
            }
        }
        
        
        
        
        driver.switchTo().frame(1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='demo']/following-sibling::*[1]")));
        driver.findElement(By.xpath("//*[@id='demo']/following-sibling::*[1]")).click();
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(parentwindow);
        driver.close();
        
        
        File src=((ChromeDriver) driver).getScreenshotAs(OutputType.FILE);
	}

}
