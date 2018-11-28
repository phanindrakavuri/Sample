package stevejobs;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
public class Screen1 
{
	public static void main(String[] args) throws Exception
	{
		//Run chromedriver.exe to get chrome browser
		System.setProperty("webdriver.chrome.driver",  "E:\\batch238\\chromedriver.exe");
		//create object to access chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		Screen s=new Screen();
		s.type("search.png","mindq");
	}
}
