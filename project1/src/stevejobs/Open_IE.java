package stevejobs;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Open_IE
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver",
				"E:\\batch238\\iedriverserver.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
	}
}







