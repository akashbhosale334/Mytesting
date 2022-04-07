package constructor;

public class variable_call {
	int a=1007;
	static int b=209898;
	String name="akash bhosale";

	public static void main(String[] args) 
	{
		variable_call v=new variable_call();
		System.out.println("value of variable a is "+v.a);//calling non static variable
		System.out.println("value of variable b is "+b);// calling s static variable
		System.out.println("value of name is "+v.name);

	}

}
