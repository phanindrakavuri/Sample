package stevejobs;
public class Provider implements Example6
{
	public int add(int x, int y)
	{
		int z;
		z=x+y;
		return(z);
	}
	public int subtract(int x, int y) 
	{
		int z;
		z=x-y;
		return(z);
	}
	public int multiply(int x, int y)
	{
		int z;
		z=x*y;
		return(z);
	}
	public int divide(int x, int y)
	{
		int z;
		z=x/y;
		return(z);
	}
	public int modulus(int x, int y)  //extra method
	{
		int z;
		z=x%y;
		return(z);
	}
}


