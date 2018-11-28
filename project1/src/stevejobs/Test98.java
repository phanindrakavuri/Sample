package stevejobs;

import java.util.Scanner;

public class Test98 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter credit card type");
		String x=sc.nextLine();
		switch(x)
		{
			case "visa":
				System.out.println("Valid card");
				break;
			case "master":
				System.out.println("Valid card");
				break;
			case "rupay":
				System.out.println("Valid card");
				break;
			default:
				System.out.println("Invalid card");                  
				break;	
		}
	}

}
