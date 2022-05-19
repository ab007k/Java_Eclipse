package sdet;

import java.util.Scanner;

public class P5palindromeString {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("EnterString:");
		String str=sc.next();

		String orgStr=str;
		
	//Reverse str
		String rev="";

		int len=str.length(); //len=4

		for(int i=len-1;i>=0;i--) { //i=3>2>1>0>-1:F
			rev=rev+str.charAt(i); //charAt():extract char from string	//D>C>B>A
		}
		
	//Compare with  orgStr
		if(orgStr.equals(rev)) {
			System.out.println(orgStr+">is Palindrome");
		}
		else {
			System.out.println(orgStr+">is not Palindrome");
		}
	}
}
