package stevejobs;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class Test74
{
	public static void main(String[] args) throws Exception
	{
		//Take any image file, which have text in content
		File f=new File("E:\\batch238\\ss.png"); 
		//Load "tessdata" file, which have characters
		File fo=LoadLibs.extractTessResources("tessdata");  
		//Create object to apply OCR on image
		Tesseract obj=new Tesseract();
		obj.setDatapath(fo.getAbsolutePath());
		String result=obj.doOCR(f);
		Thread.sleep(20000);
		System.out.println(result);
	}
}
