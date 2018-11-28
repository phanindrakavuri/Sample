package stevejobs;

public class Example3
{
	//Data members
	public int x;
	public float y;
	public char z;
	public boolean w;
	public String s;
	//Constructor methods
	public Example3()
	{
		x=10;
		z='Q';
		s="mindq";
	}
	public Example3(int a, char b, String c)
	{
		x=a;
		z=b;
		s=c;
	}
	//operational methods
	public void method1()
	{
		System.out.println(x+"\n"+y+"\n"+z+"\n"+w+"\n"+s);
	}
}
