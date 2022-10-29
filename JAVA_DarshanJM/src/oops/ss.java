package oops;

public class ss {
	public static void main  (String[]a) {
		int var1=1,var2=0,count=1;
		try {
			count++;
			if(var1/var2>1) {
				var1=var1+1;
			}
		}
		catch(ArithmeticException e) {
			count++;
		}
		catch(IndexOutOfBoundsException e) {
			count++;
		}
		finally {
			count++;
		}
		count++;
		System.out.println(count++);
	}

}
