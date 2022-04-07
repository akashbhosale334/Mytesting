package variable_datatypes;

public class Hr_Portal {

	public static void main(String[] args)
	{
		Employee AniketK=new Employee();//created object of employees
				AniketK.Emp_Name="Aniket Jagadale";
				AniketK.Emp_Code="4523A";
				AniketK.Emp_Grade='A';
				AniketK.Emp_salary=60000.525f;
				
				Employee AjayA=new Employee();
				AjayA.Emp_Name="Ajay Aradkar";
				AjayA.Emp_Code="458G";
				AjayA.Emp_Grade='B';
				AjayA.Emp_salary=450000f;
				
				Employee Umangp=new Employee();
				Umangp.Emp_Name="umang patil";
				
				
				AniketK.emp_info();//calling of the object
				AjayA.emp_info();
	}

}
