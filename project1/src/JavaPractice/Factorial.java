package JavaPractice;

public class Factorial {
public static void main(String[] args) {
	
	int max =5 , fact =1;
	
	for (int i =1 ; i<=max ; i++)
	{
		fact =fact * i;
	}
	
	System.out.println(fact);
}
}
