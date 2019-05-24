package JavaPractice;

public class Fibonacci {
	public static void fib(int max)
	{
		int n1 =0, n2=1 , n3 = 0;
		System.out.print(n1 +" "+ n2);
		for (int i =0; i<max ; i++)
		{
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2 ;
			n2 = n3;
		}
		
	}
	
public static void main(String[] args) {
	int n1=0, n2=1, i, n3 , max=19;
	System.out.print(n1+" "+n2);
	for (i=2; i<max ; i++)
	{
		n3 = n1+n2;
		System.out.print(" "+n3);
		n1 = n2;
		n2 =n3;
	} 
	
	fib(5);
}
}
