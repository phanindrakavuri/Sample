package stevejobs;
public class Test86
{
	public static void main(String[] args) 
	{
		Example4 obj=new Example4();
		int o1=obj.add(10);
		System.out.println(o1); //10+0+0
		int o2=obj.add(10,20);
		System.out.println(o2); //10+20+0
		int o3=obj.add(10,20,30);
		System.out.println(o3); //10+20+30
	}
}


