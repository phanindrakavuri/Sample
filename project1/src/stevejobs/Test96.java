package stevejobs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test96 
{
	public static void main(String[] args) throws IOException
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
		String m=sc.nextLine();
		System.out.println(
		 "Enter mobile number criteria as valid or invalid");
		String mc=sc.nextLine();
		System.out.println("Enter Password");
		String p=sc.nextLine();
		System.out.println(
		     "Enter Password criteria as valid or invalid");
		String pc=sc.nextLine();
		//Automate w2sms
		WebDriver driver=null;
		try
		{
			//Run browser driver to get browser                    
			System.setProperty("webdriver.gecko.driver",
					       "E:\\batch238\\geckodriver.exe");
			//Create object to access that opened browser
			driver=new FirefoxDriver();
			//Launch site
			driver.get(
				  "http://site21.way2sms.com/content/index.html");
			//Wait until page is ready
			WebDriverWait w=new WebDriverWait(driver,100);
			w.until(ExpectedConditions.visibilityOfElementLocated(
					                       By.name("username")));
			driver.manage().window().maximize();
			//Do login
			driver.findElement(By.name("username")).sendKeys(m);
			driver.findElement(By.name("password")).sendKeys(p);
			driver.findElement(By.id("loginBTN")).click();
			Thread.sleep(5000);
			//Validations
			if(m.length()==0 && 
					ExpectedConditions.alertIsPresent()!=null)
			{
			  System.out.println("Test passed for blank mobile number");
			  driver.switchTo().alert().dismiss();
			}
			else if(m.length()<10 && 
					 ExpectedConditions.alertIsPresent()!=null)
			{
				System.out.println(
						"Test passed for wrong size of mobile number");
				driver.switchTo().alert().dismiss();
			}
			else if(p.length()==0 && 
					ExpectedConditions.alertIsPresent()!=null)
			{
				System.out.println("Test passed for blank password");
				driver.switchTo().alert().dismiss();
			}
			else if(mc.equalsIgnoreCase("invalid") &&
					driver.findElement(By.xpath(
					"//*[contains(text(),'registered yet')]"))
					.isDisplayed())
			{
				System.out.println(
						"Test passed for invalid mobile number");
			}
			else if(mc.equalsIgnoreCase("valid") && 
				pc.equalsIgnoreCase("invalid") && 
				driver.findElement(By.xpath(
				"//*[contains(text(),'Forgot Password')]"))
				.isDisplayed())
			{
				System.out.println("Test passed for invalid Password");
		    }
			else if(mc.equalsIgnoreCase("valid") && 
					pc.equalsIgnoreCase("valid") &&
					driver.findElement(By.xpath(
					"//*[text()='Send SMS']")).isDisplayed())
		   	{
			   System.out.println("Test passed for valid data");
		   	}
		   	else
		   	{
		   		File src=((TakesScreenshot)driver).getScreenshotAs(
		   				                          OutputType.FILE);
		   		File dest=new File("ss1.png");
		   		FileUtils.copyFile(src,dest);
		   		System.out.println("Test failed");
		   	}
			//Close site
			driver.close();
		}
		catch(Exception e)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(
					                           OutputType.FILE);
			File dest=new File("ss2.png");
			FileUtils.copyFile(src,dest);
			System.out.println(e.getMessage());
			driver.close();
		}
	}

}
