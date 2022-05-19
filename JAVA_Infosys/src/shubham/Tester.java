package shubham;

public class Tester {
	public static int temp;
	
	Tester(int temp){
		System.out.println("Value="+temp);
	}

	public static void main(String[] args) {
		Tester tester=new Tester(20);
		System.out.println("Sum="+tester.temp+Tester.temp);
		

	}

}
