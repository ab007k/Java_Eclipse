package oops;

public class Employee 
{
	String ename;
	int eid;
	double esal;
	
	public Employee(String name,int id,double sal)
	{
		this.ename=name;
		this.eid=id;
		this.esal=sal;
	}
	
	void work()
	{
		System.out.println("Emp is Working");
	}

	
	void display()
	{
		System.out.println("ENAME: "+ename);
		System.out.println("EID: "+eid);
		System.out.println("ESAL: "+esal);
	}

	public static void main(String[] args)
	{
		Employee e1=new Employee("Rohan",1,10000);
		e1.work();
		e1.display();
	}

}
