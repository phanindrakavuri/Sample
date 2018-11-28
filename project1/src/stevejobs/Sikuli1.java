package stevejobs;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
public class Sikuli1 
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		//s.click("minimize.png");
		Thread.sleep(5000);
		s.rightClick("desktop.png");
		Thread.sleep(5000);
		for(int i=1;i<=3;i++)
		{
			s.type(Key.DOWN);
			Thread.sleep(5000);
		}
		s.type(Key.ENTER);
	}
}
