package JavaPractice;

public class Callby {

	int data = 50;
	
	void change(int data) {
		data = data + 100;
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		Callby c = new Callby();
		c.change(200);
	
		int a =19;
		
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		
		Integer in = new Integer(17);
		int b = in.intValue();
		System.out.println(b);
		
	}

}
