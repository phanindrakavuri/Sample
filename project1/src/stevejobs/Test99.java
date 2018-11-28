package stevejobs;

import java.util.Scanner;

public class Test99
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grade");
		String x=sc.nextLine();
		char y=x.charAt(0);
		switch(y)
		{
		case 'A':
			System.out.println("Qualified");
			break;
		case 'B':
			System.out.println("Qualified");
			break;
		case 'C':
			System.out.println("Qualified");
			break;
		default:
			System.out.println("OverQualified");                     
			break;
		}
	}

}





