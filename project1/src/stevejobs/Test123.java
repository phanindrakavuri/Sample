package stevejobs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test123
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
		//Data driven
		String l="";
		while((l=br.readLine())!=null)
		{
			String p[]=l.split(",");
			for(int i=0;i<p.length;i++)
			{
				bw.write(p[i]);
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









