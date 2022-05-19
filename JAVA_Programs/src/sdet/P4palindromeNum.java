package sdet;

import java.util.Scanner;

public class P4palindromeNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("EnterNum:");
		int num=sc.nextInt();

		int orgNum=num;
		
	//Reverse num
		int rev=0;

		while(num!=0) {
			rev=rev*10 + num%10; //0*10 + 1234/10 = 4>43>432>4321
			num=num/10; //1234/10 = 123>12>1>0
		}
		
	//Compare with  orgNum	
		if(orgNum==rev) {
			System.out.println(orgNum+">is palindrome");
		}
		else {
			System.out.println(orgNum+">is not palindrome");
		}


	}

}
