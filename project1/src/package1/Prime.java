package package1;

public class Prime {
	
public static void even_odd(int num)
{
	if(num%2==0)
	{
		System.out.println(num +" is Even number");
	}
	else
	{
		System.out.println(num +" is odd number");
	}
}
	
public static void prime(int num)
{
	boolean flag = true;
	
	for (int i=2;i<num ;i++)
	{
		if (num%i == 0)
		{
			flag = false;
			break;
		}
	}
	if (flag)
	{
		System.out.println(num +"---> is prime");
	}
	else 
	{
		System.out.println(num +"---> is not prime");
	}
}

public static void main(String[] args) {

		even_odd(22774);
		prime(45);
		
}
}
