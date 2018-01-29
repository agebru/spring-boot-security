package multhitreading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
	private static String name;
    static private int value;
    
    
	public static void main(String[] args) throws InterruptedException {
		Map<Integer,String> mp=new ConcurrentHashMap<Integer,String>();
		mp.put(1, "Emanuel");
		mp.put(2, "Hagos");
		mp.put(3, "Belay");
		//Map<String,String>mp2=new synchronizedMap<String,String>();
		List<String> names=Arrays.asList("Abebe","Kebede","Derege");
		
		
		Map<Integer,String> synMap=Collections.synchronizedMap(mp);
		
		Set<Integer> ids=synMap.keySet();
		for(Integer id:ids){
			System.out.println(id+" --> "+synMap.get(id));
		}
		
		
		//System.out.println("Hagos==> "+synMap.get(2));
		
		
		
		 final int x;
		//System.out.println("X:"+x++);
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
		
		ThreadDemo.name="THREAD-EXAMPLE";
		ThreadDemo.value=200;
		
		
		
		
		Thread t=new Thread(){
			@Override
		public void run(){
				for(int i=0;i<5;i++){
						System.out.println("this is inside thread");
						try{Thread.sleep(500);}catch(InterruptedException ex){}
				}
		}
		};
		
		t.start();
		t.join();
		System.out.println("Name:"+ThreadDemo.name+" Value:"+ThreadDemo.value);
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
