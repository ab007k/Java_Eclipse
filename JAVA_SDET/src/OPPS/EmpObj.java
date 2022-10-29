package OPPS;

public class EmpObj 
{
	int empid;
	String empname; 
	int salary;
	int deptno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[])
	
	{
		EmpObj emp1=new EmpObj();
		emp1.empid=1;
		emp1.empname="Raj";
		emp1.salary=10000;
		emp1.deptno=10;
		emp1.display();
				
		EmpObj emp2=new EmpObj();
		emp2.empid=2;
		emp2.empname="Kiran";
		emp2.salary=10001;
		emp2.deptno=20;
		emp2.display();
		
	}

}
