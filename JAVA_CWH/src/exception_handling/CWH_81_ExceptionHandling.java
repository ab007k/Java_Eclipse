package exception_handling;
import java.util.Scanner;

public class CWH_81_ExceptionHandling {
	public static void main(String[]a){
		int [] mark=new int[3];
		mark[0]=17;
		mark[1]=2;
		mark[2]=44;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value by which divide to index value: ");
		int num=sc.nextInt();
		System.out.println("Enter Array index: ");
		int ind=sc.nextInt();
		try {
			System.out.println("The value at Entered array index: "+mark[ind]);
			System.out.println("res=Array value/num: "+mark[ind]/num);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured!");
			System.out.println(e);
			
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmaticException Occured!");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Something new Exception Occured!");
			System.out.println(e);
		}	
	}

}
