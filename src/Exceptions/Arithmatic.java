package Exceptions;

public class Arithmatic {

	public static void main(String[] args) {
int a=10;
int b=0;
try
{
	int div=a/b;
	System.out.println(div);
	
} catch (Exception e)
{
	System.out.println("cannot divide by zero");
}
System.out.println("hi alll");
	}

}
