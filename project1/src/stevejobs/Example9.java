package stevejobs;

public class Example9 extends Example8
{
	public int x;
	public Example9()
	{
		super.x=20;
		this.x=30;
	}
	public void display()
	{
		System.out.println(super.x);
		System.out.println(this.x);
	}
}

