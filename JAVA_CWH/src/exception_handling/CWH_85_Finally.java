package exception_handling;

public class CWH_85_Finally {
	public static int div() {
		try {
			int a=44;
			int b=22;
			int c=a/b;
			return c; //if return statement get executed control transfer direct 
		}             //inside the main method...without executing further code
		              //in that case if we want to execute the remaining code 
		              //use finally block..(same for break statement also)
		catch(Exception e) {
			System.out.println(e);
		}
		//finally {
			System.out.println("fineshed!");
		//}
	
		return -1;
	}
	 public static void main(String[] args) {
	        int k = div();
	        System.out.println(k);
	 }
}
