package variable_datatypes;

public class Global_variable {
	int a=10;//global variable non static 
	static int b=50;// global static variable

	public static void main(String[] args)
	{
		System.out.println("value of b is"+b);
		//calling global static variable
		Global_variable gv=new Global_variable();
		gv.test();//calling non static method
		System.out.println("value of a is"+gv.a);
		test1();//calling static variable

	}
	public void test()
	{
		int c=10;//local variable
		int sum=c+a;//using global variable adding in local
		System.out.println("Addition is "+sum);
		// int sum1 =a+d;--->we cannot use local variable from another class
	}
	public static void test1()
{
	int c=30;
	int d=80;
	int sub =d-b;//using global static variable
	System.out.println("Substraction is "+sub);
}
//we cannot use variables ofnonstatic in static
	//we can use variables both statc and non static
	//in method we cant call static variable
}