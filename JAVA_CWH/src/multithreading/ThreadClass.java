package multithreading;
//class MyThread11
//{
// public void run() {
//	 int i=0;
//	 while(i<10000) {
//	 System.out.println("My cooking thread is running");
//	 System.out.println("Im happy!");
//	 }
// }
//}
//class MyThread1 extends MyThread11{
//{
// int j=1;
// }
//}

//notpossible to extending Thread class, if your class had already extended some other class!
class MyThread1 extends Thread
{
 @Override
 public void run() {
	 int i=0;
	 while(i<10000) {
	 System.out.println("My cooking thread is running");
	 System.out.println("Im happy!");
	 }
 }
}

class MyThread2 extends Thread
{
 @Override
 public void run() {
	 int i=0;
	 while(i<10000) {
	 System.out.println("janu stop chatting");
	 System.out.println("Im sad!");
	 }
 }
}
public class ThreadClass {
	public static void main(String[]a) {
	MyThread1 t1=new MyThread1();
	MyThread2 t2=new MyThread2();
	t1.start();
	t2.start();
	}

}
