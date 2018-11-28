package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Sikuli2
{
	public static void main(String[] args) throws Exception
	{
		//Launch site(SWD)
		System.setProperty("webdriver.chrome.driver",
				   "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Search for a video(SWD)
		driver.findElement(By.name("search_query"))
		                .sendKeys("abdul kalam sir speech");
		driver.findElement(By.xpath(
				"(//*[@aria-label='Search'])[3]/child::*[1]"))
		                                             .click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText(
				"Dr. A P J Abdul Kalam in European")).click();
		Thread.sleep(10000);
		//Video automation(Sikulix)
		Screen s=new Screen();
		if(s.exists("skipadd.png")!=null)
		{
			s.click("skipadd.png");
		}
		//move mouse pointer to video body
		Location l=new Location(200,200);
		s.wheel(l,Button.LEFT,0);
		s.click("pause.png");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0);
		s.click("play.png");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0);
		s.mouseMove("volume.png");
		Thread.sleep(5000);
		Match e=s.find("bubble.png");
		int x=e.getX();
		int y=e.getY();
		Location p1=new Location(x-20,y);
		s.dragDrop(e,p1);
		Thread.sleep(5000);
		Location p2=new Location(x+20,y);
		s.dragDrop(e,p2);	
		//Close site(SWD)
		driver.close();
	}
}







