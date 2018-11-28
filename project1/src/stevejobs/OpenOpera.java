package stevejobs;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
public class OpenOpera
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.opera.driver",
				"E:\\batch238\\operadriver_win64\\operadriver.exe");
		OperaOptions o=new OperaOptions();
		o.setBinary("C:\\Program Files\\Opera\\51.0.2830.55\\opera.exe");
		OperaDriver driver=new OperaDriver(o);
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
	}
}
