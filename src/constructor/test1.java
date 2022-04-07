package constructor;

public class test1 {

	public static void main(String[] args)
	{
		variable_call vc = new variable_call();//created object of another class
		System.out.println("value of a is "+vc.a);//calling non static variable from another class
System.out.println("value of b is "+variable_call.b);//calling nonstatic variable from another class
	}

}
