package stevejobs;

import java.util.Scanner;

public class Test116
{
	public static void main(String[] args)
	{
		//Get number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit");
		int l=sc.nextInt();
		int x=0;
		int y=1;
		System.out.print(x+" "+y);
		do
		{
			int z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;	
		}while((x+y)<=l);                                            
	}

}
