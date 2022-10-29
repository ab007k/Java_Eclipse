package exception_handling;
import java.util.Scanner;
public class CWH_79_RuntimeError {
	public static void main(String[] args) {
		int k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		k=sc.nextInt();	
		System.out.println(100/k);//if user enter the value for k is 0,then we get runtime error/exception
	}

}
