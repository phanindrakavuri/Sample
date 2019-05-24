package JavaPractice;

public class OverRidding2 extends OverRidding1{
  public static int a= 10;
 static void run()
   {
	   System.out.println("overRidding2");
   }
 
   public static void main(String[] args) {
	a=30;
   OverRidding1 object1 = new OverRidding1();
   object1.run();
   OverRidding2 object = new OverRidding2();
   object.run();
   System.out.println(object.a);

   
}
   
   public static void main(String args) {
	   
	System.out.println(a);
}
}