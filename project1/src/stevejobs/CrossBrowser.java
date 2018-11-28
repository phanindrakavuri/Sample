package stevejobs;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.Select;
public class CrossBrowser
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Enter browser name");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		WebDriver driver=null;
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"E:\\batch238\\chromedriver.exe");
			driver=new ChromeDriver(); 
			
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
				          "E:\\batch238\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(x.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",
			          "E:\\batch238\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else if(x.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver",
		  "E:\\batch238\\operadriver_win64\\operadriver.exe");
			OperaOptions o=new OperaOptions();
			o.setBinary("C:\\Program Files\\Opera\\51.0.2830.55\\opera.exe");
			driver=new OperaDriver(o);
		}
		else
		{
			System.out.println("Wrong browser name");
			System.exit(0); //stop execution forcibly
		}
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(5000);
		//Click Register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("firstName"))
		                                  .sendKeys("abdul");
		driver.findElement(By.name("lastName"))
		         .sendKeys("kalam",Keys.TAB,"9999988845");
		driver.findElement(By.name("userName"))
		                      .sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("address1"))
									.sendKeys("Mosqe street");
		driver.findElement(By.name("address2"))
								.sendKeys("Dhanushkoti road");
		driver.findElement(By.name("city"))
									.sendKeys("Rameshwaram");
		driver.findElement(By.name("state"))
		                              .sendKeys("Tamilnadu");
		driver.findElement(By.name("postalCode"))
										.sendKeys("65678");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		driver.findElement(By.name("email"))
		.sendKeys("apjkalam11");
		driver.findElement(By.name("password"))
								.sendKeys("batch238sixpack");
		driver.findElement(By.name("confirmPassword"))
					.sendKeys("batch238sixpack",Keys.ENTER);
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
