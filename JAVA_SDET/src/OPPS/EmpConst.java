package OPPS;

public class EmpConst 
{
	int eid;
	String ename;
	int esal;
	int deptno;
	
	EmpConst(int id,String name,int sal,int dn) 
	{
		eid=id;
		ename=name;
		esal=sal;
		deptno=dn;
	}

	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(deptno);
	}
	

	public static void main(String[] args) 
	{
		EmpConst emp3=new EmpConst(3,"Rahul",20000,30);
		emp3.display();
	}

}
