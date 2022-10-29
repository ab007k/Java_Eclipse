package multithreading;
class ConstClass extends Thread{
	
	public ConstClass(String name){ //Const of Thread Class
		super(name);
	}
	
	@Override
	public void run() {
		int i=34;
		System.out.println(i);
	}	
}

public class ConstThrClass {
	public static void main(String[] args) {
		ConstClass cc=new ConstClass("janni"); //pass any string
		cc.start();
		System.out.println(cc.getId());
		System.out.println(cc.getName());

	}

}
