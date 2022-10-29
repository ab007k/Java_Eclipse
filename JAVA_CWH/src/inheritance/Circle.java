package inheritance;

class Circle
{
	public int radius;

	Circle()
	{
	System.out.println("Circle()");
	}
	
	Circle(int r)
	{
	System.out.println("Circle(int r)");
	this.radius=r;
	}

	public double area()
	{
		return Math.PI*this.radius*this.radius;

	}
}

class Cylinder extends Circle
{
	public int height;
	Cylinder(int r,int h)
	{
		super(r);
		System.out.println("Cylinder(int r,int h)");
		this.height=h;
	}

	public double volume()
	{
		return Math.PI*this.radius*this.radius*this.height;

	}


	public static void main(String[] args) 
	{
		//Circle objC=new Circle(12);
		Cylinder objCy=new Cylinder(12,4);
		double A=objCy.volume();
		System.out.println("A:"+A);
	}
}
