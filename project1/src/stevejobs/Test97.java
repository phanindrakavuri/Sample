package stevejobs;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test97
{
	public static void main(String[] args) throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Userid");
		String uid=sc.nextLine();
		System.out.println(
		   "Enter Userid criteria as valid or invalid");
		String uc=sc.nextLine();
		String p="";
		String pc="";
		if(uc.equalsIgnoreCase("valid"))
		{
			System.out.println("Enter Password");
			p=sc.nextLine();
			System.out.println(
				     "Enter Password criteria as valid or invalid");
			pc=sc.nextLine();
		}
		//Automate Gmail
		WebDriver driver=null;
		try
		{
			//Run browser driver to get browser                    
			System.setProperty("webdriver.gecko.driver",
		 		       "E:\\batch238\\geckodriver.exe");
			driver=new FirefoxDriver();
			//Launch site
			driver.get("http://www.gmail.com");
			//Wait until page is ready
			WebDriverWait w=new WebDriverWait(driver,100);
			w.until(ExpectedConditions.visibilityOfElementLocated(
							                  By.name("identifier")));
			driver.manage().window().maximize();
			//Enter Userid and click next
			driver.manage().timeouts().implicitlyWait(10,
					                     TimeUnit.SECONDS);
			driver.findElement(By.name("identifier")).sendKeys(uid);
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			Thread.sleep(5000);
			//Userid validations
			if(uc.equalsIgnoreCase("valid") && 
				driver.findElement(By.name("password"))
				.isDisplayed())
			{
				System.out.println("Valid userid test passed");
				//Enter password and click next
				driver.findElement(By.name("password")).sendKeys(p);
				driver.findElement(By.xpath("//*[text()='Next']"))
				                                           .click();
				Thread.sleep(5000);
				//Password validations
				if(pc.equalsIgnoreCase("valid") &&
					driver.findElement(
					By.xpath("//*[text()='COMPOSE']")).isDisplayed())
				{
					System.out.println("Valid PWD test passed");
				}
				else if(p.length()==0 &&
						driver.findElement(
						By.xpath("//*[text()='Enter a password']"))
						.isDisplayed())
				{
					System.out.println("Blank PWD test passed");
				}
				else if(pc.equalsIgnoreCase("invalid") &&
						driver.findElement(
						By.xpath("//*[contains(text(),'Wrong password')]"))
						.isDisplayed())
				{
					System.out.println("Invalid PWD test passed");
				}
				else
				{
					System.out.println("PWD test failed");
					File src=((TakesScreenshot)driver).getScreenshotAs(
	                          OutputType.FILE);
					File dest=new File("pwdss.png");
					FileUtils.copyFile(src,dest);
				}
			}
			else if(uid.length()==0 &&
					driver.findElement(By.xpath(
					"//*[contains(text(),'Enter an email')]"))
					.isDisplayed())
			{
				System.out.println("Blank userid test passed");
			}
			else if(uc.equalsIgnoreCase("invalid") &&
					driver.findElement(By.xpath(
					"(//*[contains(text(),'find your Google')])[2]"))
					.isDisplayed())
			{
				System.out.println("Invalid userid test passed");
			}
			else
			{
				System.out.println("Userid test failed");
				File src=((TakesScreenshot)driver).getScreenshotAs(
	                          OutputType.FILE);
				File dest=new File("uidss.png");
				FileUtils.copyFile(src,dest);
			}
			//close site
			driver.close();
		}
		catch(Exception e)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(
                                              OutputType.FILE);
			File dest=new File("exceptionss.png");
			FileUtils.copyFile(src,dest);
			System.out.println(e.getMessage());
			driver.close();
		}
	}
}








