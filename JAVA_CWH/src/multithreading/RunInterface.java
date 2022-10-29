package multithreading;
class MyThreadRab1 implements Runnable{
	public void run() {
		int i=0;
		while (i<10000) {
		System.out.println("Diljale part_1");
		}		
	}
}
class MyThreadRab2 implements Runnable{
	public void run() {
		int i=0;
		while (i<10000) {
		System.out.println("Dilwale_2");
		}
	}
}
public class RunInterface {
	public static void main(String[]a) {
	MyThreadRab1 bullet1=new MyThreadRab1();
	Thread gun1=new Thread(bullet1);
	MyThreadRab2 bullet2=new MyThreadRab2();
	Thread gun2=new Thread(bullet2);
	gun1.start();
	gun2.start();
	}
}
