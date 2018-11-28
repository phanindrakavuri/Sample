package stevejobs;

import java.util.Iterator;

import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class Sikuli3
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		s.click("minimize.png");
		Thread.sleep(5000);
		/*Iterator<Match> l=s.findAll("edit.png");
		l.next().click(); //first matched element*/
		Region r=new Region(0,0,200,300);
		r.click("edit.png");
		
	}
}




