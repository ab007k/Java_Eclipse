package multithreading;

class Prity1 extends Thread
{
 @Override
 public void run(){
	 System.out.println("janu stop chatting_1");
	 System.out.println("Im sad!");
	 }
}

class Prity2 extends Thread
{
 @Override
 public void run() {
	 
	 System.out.println("janu reply_2");
	 System.out.println("Im happy!");
 }
}

public class ThrPri {
	public static void main(String[]a) {
		Prity1 p1=new Prity1();
		Prity2 p2=new Prity2();
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(p1.getPriority());
		System.out.println(p2.getPriority());
		p1.start();
		p2.start();
		
		
		
		
	}

}
