package Interface;
interface MF1
{
	int a=10;
	void display1();
}
interface MF2
{
	int b=100;
	void display2();
}

public class MultiInheri implements MF1,MF2
{	//Implementation of Abstract Method of IF1 &IF2
	public void display1() 
	{
		System.out.println(a);
	}
	public void display2() 
	{
		System.out.println(b);
	}
	
	//Object Cretion
	public static void main(String[]a)
	{
		MultiInheri mh1=new MultiInheri();
		mh1.display1();
		mh1.display2();
	}
		

}
