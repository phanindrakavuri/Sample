package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableTest {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\shiva\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
    System.out.println("No of cols are : " +col.size()); 
    
    //No.of rows 
    List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
    System.out.println("No of rows are : " + rows.size());
}
}
