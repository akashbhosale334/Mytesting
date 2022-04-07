package variable_datatypes;

public class test_variable {
int a= 90;//global non static variable
 static int b=45;//global static variable
	public static void main(String[] args)
	{
		test_variable t=new test_variable();
		int sum=50+t.a;
		System.out.println("sum is "+sum);
		int sub=300-b;
		System.out.println("sub is "+sub);
		int mul=10*t.a;
		System.out.println("mul is "+mul);
		int sub1=b-t.a;
		System.out.println("sub1 is "+sub1);
	}

}
