package arrrray;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		
		
		//1.declaration
		 char grade[]=new char[6];
		 
		 //2.initialization
		 grade[0]='f';
		 grade[1]='e';
		 grade[2]='d';
		 grade[3]='c';
		 grade[4]='b';
		 grade[5]='a';
		 
		 // Usages
//	 System.out.println(grade[0]);
//		 System.out.println(grade[1]);

		
//  for(int i=0;i<=5;i++)
//		 {
//		 System.out.println(grade[i]);
		 
//		 }
	 for (int i=0;i<=grade.length-1;i++)//dynamic coding method call we need object grade is object
		 {
			 System.out.println(grade[i]);
		 }
	    Arrays.sort(grade);
	    System.out.println("=============After sorting==========");
	    for (int i=0;i<=grade.length-1;i++)
	    {
	    	System.out.println(grade[i]);//ascending order
	    }
	    	System.out.println("==============descending oder=================");
	   
  	for (int i=grade.length-1;i>=0;i--)
	    	{
    		System.out.println(grade[i]);

	    	}
	}}
	

