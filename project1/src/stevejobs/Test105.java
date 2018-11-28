package stevejobs;

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		String rev="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char y=x.charAt(i);
			rev=rev+y;
		}
		System.out.println(rev);
		if(rev.equals(x))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");                     
		}
	}
}






