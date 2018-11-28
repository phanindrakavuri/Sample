package stevejobs;

public class Test89
{
	public static void main(String[] args)
	{
		Example7 obj1=new Bodies();
		int o1=obj1.add(10, 20); //body in Example7
		int o2=obj1.substract(10,20); //body in Bodies
		System.out.println(o1+" "+o2);
		Bodies obj2=new Bodies();
		int o3=obj2.add(20, 30); //body in Example7
		int o4=obj2.substract(20, 30); //body in Bodies
		System.out.println(o3+" "+o4);
	}
}





