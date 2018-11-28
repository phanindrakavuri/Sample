package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox
{
	public static void main(String[] args)
	{
		//Run geckodriver.exe to get firefox browser
		System.setProperty("webdriver.gecko.driver","E:\\batch238\\geckodriver.exe");
		//create object to access firefox browser
		FirefoxDriver driver=new FirefoxDriver();               
		driver.get("http://www.google.co.in");
	}
}




