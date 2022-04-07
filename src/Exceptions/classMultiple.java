package Exceptions;

public class classMultiple {

	public static void main(String[] args) {
int a=10;
int b=0;
try
{
	int  div=a/b;
	System.out.println(div);
} 

catch (NullPointerException  e)
{
	System.out.println("cant perform actions on Null vAlue");
}

catch (StringIndexOutOfBoundsException e) {
	System.out.println(" check string Index");
}
catch (Exception e) {
	e.printStackTrace();
	System.out.println("generic Exception caught");
}
//		catch (ArithmeticException e) {
//					}
//		System.out.println("Divide by zero is not possible");
//		
//	}
	finally {
System.out.println("hi Finally is excuted");
}
}}