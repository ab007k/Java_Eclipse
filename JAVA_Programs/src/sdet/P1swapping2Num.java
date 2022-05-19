package sdet;

public class P1swapping2Num {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Num Before Swapping:"+a+","+b);
		
	//Logic1-Third var
		/*int  c=a;
		a=b;
		b=c;
		*/		
	//Logic2-Use Operator(+,-)->no need third var
		/*a=a+b;
		b=a-b;
		a=a-b;
		*/	
	//Logic3-Use  Operator(*,/)->no need third var//Note:a,b:>non zero//
		/*a=a*b;
		b=a/b;
		a=a/b;
		*/
		
	//Logic4-Operator bitwise(XOR^)->both same-0,diff-1
		/*a=a^b; //a=10:1010,b=20:10100-->a ^b=11110=30
		b=a^b; //10
		a=a^b; //20
		*/
		
	//Logic5-Single  Statement
		//exe:L->R
		b=a+b-(a=b);
		System.out.println("Num After Swapping:"+a+","+b);
		

		
		
		

	}

}
