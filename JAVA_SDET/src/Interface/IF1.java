package Interface;
interface IntFace
{
	int a=10;
	void display();
}

public class IF1 implements IntFace
{
	public void display() 
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		//IF1 if1=new IF1();
		IntFace if1=new IF1();
		if1.display();

	}

}
