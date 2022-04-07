package constructor;

public class cs2{

	public cs2() //this is user defined zero parameter program
{
	System.out.println("running zero parameter constructor");
}
	public static void main(String[] args)
	{
	cs2 c2=new cs2();//creating object of a class
	c2.test1(); //calling non static method

	}
public void test1() 
{
	System.out.println("this is test1 non static method ");
}
}