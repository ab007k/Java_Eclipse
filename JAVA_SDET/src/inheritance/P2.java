package inheritance;
//hierarchy
class P
{
	int a;
	int b;

	void display1() 
	{
		System.out.println(a+b);	
	}

}

class Q extends P
{
	int x;
	int y;

	void display2() 
	{
		System.out.println(x+y);	
	}

}

class R extends P
{
	int p;
	int q;

	void display3() 
	{
		System.out.println(p+q);	
	}

}


class P2
{
	public static void main(String[] a)
	{
		Q ob=new Q();
		ob.a=10;
		ob.b=20;
		ob.display1();
		
		R oc=new R();
		oc.a=100;
		oc.b=200;
		oc.display1();
		
	}
}


