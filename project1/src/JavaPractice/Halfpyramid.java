package JavaPractice;

public class Halfpyramid {

	public static void main(String[] args) {
		
		int max =9;
		int num =1;
		for (int i=0;i<=max;i++)
		{
			
			 for (int j=max-i; j>1; j--) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
			 
			 
			for (int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
			num =num+1;	
			}
			System.out.println();
		}
	
	}
}
