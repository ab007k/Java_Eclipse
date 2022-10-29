package sdet;

public class P3reverseString {
	
	public static void main(String[] args) {
		
		String str="ABCD";
		String rev="";
	//1) Using String concatenation Operator(+)
		/*int len=str.length(); //len=4
		
		for(int i=len-1;i>=0;i--) { //i=3>2>1>0>-1:F
			rev=rev+str.charAt(i); //charAt():extract char from string	//D>C>B>A
		}
		*/
	//2) Using character Array
		/*char[]a=str.toCharArray(); //A//B//C//D//
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) { //i=3>2>1>0>-1:F
			rev=rev+a[i]; //DCBA
		}
		*/
	//3) Using StringBuffer class
		StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse=sb.reverse();
		System.out.println("ReverseString:"+reverse);	
	}
	

	
}
