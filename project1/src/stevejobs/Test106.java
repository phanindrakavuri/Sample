package stevejobs;

import java.util.Scanner;

public class Test106
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");                           
		String x=sc.nextLine();
		int uc=0;
		int lc=0;
		int dc=0;
		int scc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>=65 && y<=90 )
			{
				uc=uc+1;
			}
			else if(y>=97 && y<=122)
			{
				lc=lc+1;
			}
			else if(y>=48 && y<=57)
			{
				dc=dc+1;
			}
			else
			{
				scc=scc+1;
			}
		}
		System.out.println("Upper case char count is "+uc);
		System.out.println("Lower case char count is "+lc);
		System.out.println("Digits count is "+dc);
		System.out.println("Special char count is "+scc);

	}

}
