package stevejobs;

import java.util.Scanner;

public class Test94
{
	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		//validation
		if(x%2==0)
		{
			System.out.println(x+" is even");
		}
		else
		{
			System.out.println(x+" is odd number");
		}
	}
}
