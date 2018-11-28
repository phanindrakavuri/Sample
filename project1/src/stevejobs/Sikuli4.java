package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Sikuli4
{
	public static void main(String[] args) throws Exception
	{
		//Launch site(SWD)
		System.setProperty("webdriver.chrome.driver",
				   "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//capture full screen's screen-shot(Sikulix)
		File f1=new File("E:\\batch238\\fullscreen.png");
		Screen s=new Screen();
		ScreenImage si1=s.capture();
		BufferedImage bi1=si1.getImage();
		ImageIO.write(bi1,"png",f1);
		//capture part of the screen as screen-shot
		File f2=new File("E:\\batch238\\partofscreen.png");
		Region r=new Region(100,100,500,400);
		ScreenImage si2=s.capture(r);
		BufferedImage bi2=si2.getImage();
		ImageIO.write(bi2,"png",f2);
		//Close site(SWD)
		driver.close();
		

	}

}




