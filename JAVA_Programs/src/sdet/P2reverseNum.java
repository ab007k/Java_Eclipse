package sdet;

import java.util.Scanner;

public class P2reverseNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("EnterNum:");
		int num=sc.nextInt();
		
	//Using Algorithm
		/*int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10; //0*10 + 1234/10 = 4>43>432>4321
			num=num/10; //1234/10 = 123>12>1>0
		}*/
		
	//Using StringBuffer class Method
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("ReverseNo:"+rev);
		*/		
	//Using StringBuilder class Method
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println("ReverseNo:"+rev);		
	}
}
