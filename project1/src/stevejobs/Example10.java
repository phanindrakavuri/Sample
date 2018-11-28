package stevejobs;
public class Example10
{
	public int x;
	private Example10()
	{
		x=10;
	}
	public static Example10 create()
	{
		Example10 obj=new Example10();
		return(obj);
	}
	public void display()
	{
		System.out.println(x);
	}
}
