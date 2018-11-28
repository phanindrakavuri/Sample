package stevejobs;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Autocomplete
{
	public static void main(String[] args) throws Exception
	{
		//Take two words from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search");
		String x=sc.nextLine();
		System.out.println("Enter expected suggestion");
		String y=sc.nextLine();
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Automate item selection in auto-complete element
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e,x).build().perform();
		Thread.sleep(5000);
		int c=1;
		while(2>1) //infinite loop
		{
			String z=e.getAttribute("value");
			if(z.equals(y))
			{
				System.out.println("Suggession was found");
				a.sendKeys(Keys.ENTER).build().perform();
				break; //terminate from loop
			}
			else
			{
				if(c==10)
				{
					System.out.println("Suggession was not found");
					break; //terminate from loop
				}
				else
				{
					a.sendKeys(Keys.DOWN).build().perform();
					c=c+1;
					Thread.sleep(5000);
				}
			}
		}
		Thread.sleep(5000);
		//close site
		driver.close();

	}

}
