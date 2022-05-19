package shubham;

public class Test {
	public static String r="";
	Test(int... a){
		r=r+a.equals(20)+"";
		r=r+(a.length==1)+"";
	}

	public static void main(String[] args) {
		Test test=new Test(20);
		Test test1=new Test(20,30);
		System.out.println("R:");
		System.out.println(r);
	}

}
