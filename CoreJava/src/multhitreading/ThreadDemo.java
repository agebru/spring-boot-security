package multhitreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {

	public static void main(String[] args) {
		Map<Integer,String> mp=new ConcurrentHashMap<Integer,String>();
	/*	
		
		Hi thread1=new Hi();
		thread1.start();
	try {
		thread1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Main Executing ...");
		
*/
	} 

}

class Hi extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
