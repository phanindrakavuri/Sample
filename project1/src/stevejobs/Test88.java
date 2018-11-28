package stevejobs;

public class Test88
{
	public static void main(String[] args) 
	{
		Example6 obj1=new Provider(); //to access 4 methods
		int o1=obj1.add(10,20);
		int o2=obj1.subtract(10,20);
		int o3=obj1.multiply(10,20);
		int o4=obj1.divide(10,20);
		System.out.println(o1+" "+o2+" "+o3+" "+o4);
		Provider obj2=new Provider(); //to access 5 methods
		o1=obj2.add(10,20);
		o2=obj2.subtract(10,20);
		o3=obj2.multiply(10,20);
		o4=obj2.divide(10,20);
		int o5=obj2.modulus(10,5);
		System.out.println(o1+" "+o2+" "+o3+" "+o4+" "+o5);
	}
}
