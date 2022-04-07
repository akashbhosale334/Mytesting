package variable_datatypes;

public class Employee
{
//name---->string
	//emp code----->HCL5425,5425--->integer or string
	//grade===>A,B,C,D--->CHAR
	//SALARY------>500000.54RS--->FLOAT
	String Emp_Name;//declaring global variable
	String Emp_Code;
	char Emp_Grade;
	float Emp_salary;
	
	public void emp_info() //non static
	{
		System.out.println("=============================");
		System.out.println("Employee name is "+Emp_Name);
		System.out.println("Employee code is "+Emp_Code);
		System.out.println("Employee_Grade is "+Emp_Grade);
		System.out.println("Employee_sal "+Emp_salary);
		System.out.println("=============================");
	}
}
