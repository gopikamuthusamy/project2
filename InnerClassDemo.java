class Outer
{
	 //int a;
	static int a;
	public static void show()
	{
		System.out.println("OuterMethod Display");
	}
	static class Inner   // Outer$Inner.class
	//class Inner   // Outer$Inner.class
	{
		public void display()
		{
			System.out.println("Inner Display");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.show();
		
		//Inner obj1 = new Inner();
		//Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}

}
