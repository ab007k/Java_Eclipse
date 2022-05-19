package multithreading;
class Inter extends Thread{
	public void run() { 
	try {
			for(int i=1;i<=5;i++) {
				System.out.println("Child Thread");//Child thread put to sleep for 4000ms,
				Thread.sleep(4000); //As soon as Child Thread goes to sleep,main thread interrupt it.
				                    //And InterruptedException is generated which is handle by the catch block.
				
			}
		}
			
		catch(InterruptedException e){
		System.out.println("Child class Interrupted");
		}
		
		System.out.println("Thread is running");
		
	}

}


public class A2_ThrMethod {

	public static void main(String[]a){
		Inter t=new Inter();
		t.start();
		t.interrupt();
		System.out.println("main method");
	}

}
