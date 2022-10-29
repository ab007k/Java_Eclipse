package amppack3;
class Highway{
	/*String htype;     //default
	String hname;    
	int hno;*/        
	
	private String htype;     
	private String hname;     
	private int hno;
	
	public void setHtype(String type) {
		this.htype=type;
	}
	 public String getHtype() {
		 return htype;
	 }
}
public class SetGetH {

	public static void main(String[] args) {
		Highway oh=new Highway();
		//oh.htype="NH"; //default_access in another class by creating obj for first class(Highway)
		oh.setHtype("NH");
		String rtn=oh.getHtype();
		System.out.println(rtn);
		
	}

}
