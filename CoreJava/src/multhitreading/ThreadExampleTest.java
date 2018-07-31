package multhitreading;

class counter{
	private int count=0;
	public synchronized void increment(){
		 count++;
		 //System.out.println("count= "+count);
	}
	
	public int getCount(){
		return count;
	}
}



public class ThreadExampleTest {

	public static void main(String[] args) throws Exception {
		counter obj=new counter();
		//System.out.println(obj.increment());
		
		Thread t1=new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					obj.increment();
				}
			}
			
		});
		
		

		Thread t2=new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
				obj.increment();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(obj.getCount());
		
		
		
	}

}
