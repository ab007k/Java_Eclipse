package multithreading;
//import java.io.*;
//import java.lang.Thread;

public class A1_ThrMethod {
	public static void main(String[] args) { //main()-method put to sleep for 2 sec every time,
		                                     //when the for loop execute 
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(2000);
				System.out.println(i);
			}
		}
			
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
