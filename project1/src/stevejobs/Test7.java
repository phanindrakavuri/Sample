package stevejobs;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
public class Test7
{
	public static void main(String[] args) throws InterruptedException
	{
		//Take browser window
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
		driver.close();
	}
}
