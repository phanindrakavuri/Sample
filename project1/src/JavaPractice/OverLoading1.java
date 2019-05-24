package JavaPractice;

 class OverLoading1 {
	 
	 
 static int  sum(int a, int b)
{
	int c= a+b;
	System.out.println(c);
	return c;
}
 
 static void sum(int a, int b, int c)
 {
	 int d= a+ b + c;
	 System.out.println(d);
 }
 
 static float sum(float a, float b)
{
	float c= a +b;
	System.out.println(c);
	
	return c;
}

 
}
