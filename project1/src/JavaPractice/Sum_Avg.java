package JavaPractice;

public class Sum_Avg {

	public static void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void average(int a, int b)
	{
		float avg = (a+b)/2;
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		sum(19,64);
		average(19,64);
	}
}
