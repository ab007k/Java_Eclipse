package inheritance;
//single level,multilevel
class A
{
	int a;
	int b;

	void display1() 
	{
		System.out.println(a+b);	
	}

}

class B extends A //single level
{
	int x;
	int y;

	void display2() 
	{
		System.out.println(x+y);	
	}

}

class C extends B //multilevel
{
	int p;
	int q;

	void display3() 
	{
		System.out.println(p+q);	
	}

}


class P1
{
	public static void main(String[] a)
	{
		C oc=new C();
		oc.a=10;
		oc.b=20;
		oc.display1();
		
		oc.x=30;
		oc.y=40;
		oc.display2();
		
		oc.p=50;
		oc.q=60;
		oc.display3();
		
		
	}
}

