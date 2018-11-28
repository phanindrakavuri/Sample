package stevejobs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test124
{
	public static void main(String[] args) throws Exception
	{
		//Open first file for reading
		File f1=new File("mydata.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);                    
		//Open second file for writing
		File f2=new File("myresult.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		//Prepare regexp
		Pattern p=Pattern.compile("[0-9]+");
		//Data driven
		String l="";
		while((l=br.readLine())!=null)
		{
			Matcher m=p.matcher(l);
			while(m.find())
			{
				bw.write(m.group());
				bw.newLine();
			} 
		}
		//Close files
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}
