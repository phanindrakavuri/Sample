package stevejobs;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
public class Open_Opera
{
	public static void main(String[] args)
	{
		OperaOptions op=new OperaOptions();
		op.setBinary("C:\\Program Files\\Opera\\51.0.2830.55\\opera.exe");
		System.setProperty("webdriver.opera.driver",
				"E:\\batch238\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver(op);
		driver.manage().window().maximize();
	}
}
