package stevejobs;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Test119
{
	public static void main(String[] args) throws IOException 
	{
		//Open a html file for results
		ExtentReports er=new ExtentReports("googleres.html",false);
		ExtentTest et=er.startTest("Google site title test");
		//Launch site
		System.setProperty("webdriver.gecko.driver",
				"E:\\batch238\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts()
		               .implicitlyWait(100,TimeUnit.SECONDS);
		String t=driver.getTitle();
		if(t.equals("Google"))
		{
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("ss1.png");
			FileUtils.copyFile(src,dest);
			et.log(LogStatus.PASS,"Title test was passed"+
			                   et.addScreenCapture("ss1.png"));
		}
		else
		{
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("ss2.png");
			FileUtils.copyFile(src,dest);
			et.log(LogStatus.FAIL,"Title test was failed"
			                 +et.addScreenCapture("ss2.png"));
		}
		//close site
		driver.close();
		//Save html file
		er.endTest(et);
		er.flush(); //save
	}
}
