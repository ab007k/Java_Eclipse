package amppack3;
class Bank{   
	private String bname;     
	private int bcode;

	public void setB(String name,int code){
		this.bname=name;
		if( code <1 || code>4) {
			throw new IllegalArgumentException();
		}
		this.bcode=code;
	}
	 public String getBname() {
		 return bname;
	 }
	 public int getBcode() {
		 return bcode;
	 }
}
public class SetGetB {

	public static void main(String[] args) {
		Bank oh=new Bank();
		//oh.htype="NH"; //default_access in another class by creating obj for first class(Highway)
		oh.setB("sbi",4);
		String rtn1=oh.getBname();
		System.out.println(rtn1);
		int rtn2=oh.getBcode();
		System.out.println(rtn2);
		
	}

}
