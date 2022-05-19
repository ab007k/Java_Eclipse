package OPPS;

public class EmpMd 
{

	int empid;
	String ename;
	int esal;
	int deptno;
	
	
	void savedata(int id,String name,int sal,int dn)
	{

		empid=id;
		ename=name;
		esal=sal;
		deptno=dn;
		
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(deptno);
	}

	public static void main(String[] args)
	{
		EmpMd emp4=new EmpMd();
		emp4.savedata(4,"Pavan",30000,40);
		emp4.display();
		
	}

}
