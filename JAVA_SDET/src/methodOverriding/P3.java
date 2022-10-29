package methodOverriding;
class X
{
	int a;
	int b;

	void display1() 
	{
		System.out.println(a+b);	
	}

}

class Y extends X
{
	int x;
	int y;

	void display1() 
	{
		System.out.println(x+y);	
	}

}

class Z extends Y
{
	int p;
	int q;

	void display1() 
	{
		System.out.println(p+q);	
	}

}


class P3
{
	public static void main(String[] a)
	{
		/*Z oz=new Z(); 
		oz.a=10;
		oz.b=20;
		oz.display1();
		
		oz.x=30;
		oz.y=40;
		oz.display1();
		
		oz.p=50;
		oz.q=60;
		oz.display1();
		*/
		//op:0,0,110
		
		Z oz=new Z();
		oz.p=50;
		oz.q=60;
		oz.display1();
		
		Y oy=new Y();
		oy.x=30;
		oy.y=40;
		oy.display1();
		
		X ox=new X();
		ox.a=10;
		ox.b=20;
		ox.display1();
	}
}

