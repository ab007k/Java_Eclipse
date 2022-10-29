package exception_handling;
import java.util.Scanner;

class MyExcepption extends Exception{
	@Override
	public String toString() {
		return "I'm toString()";		
	}
	
	@Override
	public String getMessage() {
		return "I'm getMessage()";		
	}
}

public class CWH_83_ExceptionClass {
	public static void main(String[]args){
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input:");
		a=sc.nextInt();
		if(a<9) {
			try {
				throw new ArithmeticException("This is my Exception");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println("Finished");
			}
			System.out.println("Exit");		
		}
	}
}
