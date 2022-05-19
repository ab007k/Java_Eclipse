package oops;

public class Bank 
{
	String Bname;
	String Badd;
	
	void savedata(String name,String add) 
	{
		Bname=name;
		Badd=add;
	}
	
	void display()
	{
		System.out.println("BNAME: "+Bname);
		System.out.println("BADD: "+Badd);
	}

	public static void main(String[] args) 
	{
		
		Bank b1=new Bank();
		b1.savedata("SBI","SHENDLA");
		b1.display();
		
		
		Bank b2=new Bank();
		b2.savedata("ICICI","MEHKAR");
		b2.display();
		
		Bank b3=new Bank();
		b3.savedata("HDFC","CHIKHLI");
		b3.display();
		
	}

}
