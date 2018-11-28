package package1;

public class Reverse {
	static int reverse(int num)
	{
		int rev_num=0;
	
		while(num>0)
		{
			int r=num%10;
			//rev_num=rev_num*10+r;
			rev_num=(rev_num*10) + (num %10);
			num /=10;
		}
		System.out.println(rev_num);
		return rev_num;
	}
	
	
	public static void main(String[] args) {
		
		reverse(123);
		revstr("hania");
		
		String s="hello";
		String rev="";
		
		
        	for (int i=s.length()-1;i>=0;i--)
        
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

	
public static String revstr(String str)
{
	String rev="";
	if(str.length()==1)
	{
		System.out.println(str);
		return str;
	}
	else
	{
		for (int i=str.length()-1;i>=0;i--)
	        
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
	
	
}
}
