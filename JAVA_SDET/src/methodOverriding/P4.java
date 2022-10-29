package methodOverriding;
class BANK
{
	int getRateOfinterest()
	{
		return 0;
	}
}

class SBI
{
	int getRateOfinterest()
	{
		return 10;
	}
}

class ICICI  
{
	int getRateOfinterest()
	{
		return 12;
	}
}



class P4 
{

	public static void main(String[] a)
	{
		SBI os=new SBI();
		int ROI1=os.getRateOfinterest();
		System.out.println("SBI_ROI->"+ROI1);

		ICICI oi=new ICICI();
		int ROI2=oi.getRateOfinterest();
		System.out.println("ICICI_ROI->"+ROI2);
		
	}

}
