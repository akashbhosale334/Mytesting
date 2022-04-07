package constructor;

public class cons2 {
	int a;//1. variable declaration
	int b;//1. variable declaration
	int c;//1. variable declaration
	
	public cons2()// zero-parameter constructor
	{
		a=100;
		b=200;
		c=300;	
		System.out.println("======running zero parameter constructor======");
		}
		
		public cons2(int num1)// constructor with one parameter
		{
			a=num1;
			//int a=100;
			System.out.println("value of a is "+a);
			System.out.println("====Running constructor with one parameter====");
			
		}
		
		public cons2(int num1, int num2)
		{
			a=num1;
			b=num2;
			System.out.println("=====Running constructor with two parameters====");
		}
		
		public cons2(int num1, int num2, int num3)
		{
			a=num1;
			b=num2;
			c=num3;
			System.out.println("=====Running constructor with three parameters====");
		}
		
		public static void main(String[] args) 
		{
			cons2 c40= new cons2();// created object
			c40.addition();
			
			cons2 c41= new cons2(800);// created object
			c41.addition();
			
			cons2 c42= new cons2(30, 60);
			c42.addition();
			
			cons2 c43= new cons2(10, 90, 100);
			c43.addition();

		}
		
		public void addition()
		{
			int sum=a+b+c;
			System.out.println("Addition is "+sum);
		}

	}
