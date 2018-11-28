package stevejobs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetBrowserSize
{
	public static void main(String[] args) throws Exception
	{
		//Open browser window
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get size
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		Thread.sleep(5000);
		//Set size
		Dimension d=new Dimension(500,600); //width & height
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//Get position
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		Thread.sleep(5000);
		//Set position
		Point p=new Point(300,300); //x & y
		driver.manage().window().setPosition(p);
		//close site
		driver.close();
		
		
		
		

	}

}
