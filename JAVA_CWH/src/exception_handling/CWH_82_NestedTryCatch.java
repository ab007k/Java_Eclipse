//Quick Quiz:  Write a java program that allows to keep accessing an array 
//until a valid index is given by the user.
package exception_handling;
import java.util.Scanner;
public class CWH_82_NestedTryCatch {	
	public static void main(String[]a) {
		int []mark=new int[3];
		mark[0]=24;
		mark[1]=2;
		mark[2]=33;
		
		Scanner sc=new Scanner(System.in);		
		boolean flag=true;
		while(flag) { //Remember don't enter true inside bracket
			System.out.println("Enter index:");
			int ind=sc.nextInt();
			try {
				System.out.println("outerTry");
				try {
					 System.out.println("innerTry");
					 System.out.println("IndexValue:"+mark[ind]);
	                 flag = false;				
	            }
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("ArrayIndexOutOfBoundsException Occured!_innerCatch");				
				}
			}
			catch(Exception e){
				System.out.println("outerCatch");					
			}				
		}
		System.out.println("Thanks!");
	}
}


