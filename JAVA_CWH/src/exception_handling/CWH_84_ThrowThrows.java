package exception_handling;
import java.util.Scanner;

class MyNegativeRadiusException extends Exception{
	@Override
	public String toString() {
		return "MyNegativeRadiusExceptoin";
	}
	@Override
	public String getMessage() {
		return "MyNegativeRadiusExceptoin";
	}
}

public class CWH_84_ThrowThrows {
	public static double area(double r) throws MyNegativeRadiusException{
		if(r<0) {
			throw new MyNegativeRadiusException();
		}
		double res=Math.PI*r*r;
		return res;		
	}
	
	public static void main(String[]args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Radius:");
			int ra=sc.nextInt();
			double ar=area(ra);
			System.out.println(ar);
		}
		catch(MyNegativeRadiusException e) {
			System.out.println("Exception");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
			
		}
	}
}
