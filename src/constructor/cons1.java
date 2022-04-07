package constructor;

public class cons1 {
//example for default constructor
	//compliler will create constructor for us---.default  constructor
	public static void main(String[] args) 
	{
		cons1 c1= new cons1();//creating object
		c1.test1();//calling nonstatic method
	}
public void test1() 
{
	System.out.println("this is test1 non static method");
}
}
