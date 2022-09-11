import java.util.*;
class employ
  {  
    static int empno;
	static double salary,total_salary;
	
    employ(double salary)
		   {
	         empno++;
             System.out.println("Employee No="+empno);
			 this.salary=salary;
             System.out.println("Salary="+salary);
			 total_salary=salary+total_salary;
		   }
    void show()
		   {
		     System.out.println("Toatal Employees : "+empno);
			 System.out.println("Total salary     : "+total_salary);
		   }
   }
class employeeSal
   {
     public static void main(String args[])
	       {
		     float s1,s2,s3;
	     	 System.out.println("Enter first employee salary");
			 Scanner sc = new Scanner(System.in);		
		     s1=sc.nextFloat();
			 employ e1=new employ(s1);
			 e1.show();
			 System.out.println("Enter second employee salary");		
		     s2=sc.nextFloat();
			 employ e2=new employ(s2);
			 e2.show();
			 System.out.println("Enter third empolyee salary");		
		     s3=sc.nextFloat();
			 employ e3=new employ(s3);
			 e3.show();

		   }
   }