package exception_handling;
import java.util.Scanner;

public class CWH_80_TryCatch {
	public static void main(String[]a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd value:");
		int n2=sc.nextInt();
		try {
			int res=n1/n2;
			System.out.println("Result:"+res);
		}
		
		catch(Exception e){	    
			System.out.println("hey man plz enter except zero:");
			n2=sc.nextInt();
			int res=n1/n2;
			System.out.println("Result:"+res);
			}	
	}

}
