package NationWide;

public class Singleton {
	private static Singleton Instance;
	static int counter=0;
  
	private Singleton(){
		counter++;
	}
	
	public static Singleton getInstance(){
		if(Instance==null){
			Instance=new Singleton();
		}
		System.out.println("value of Counter:"+counter);
		
		return Instance;
	}
	
	public static void main(String[] args) throws Exception
	{
		
		Singleton obj=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		Singleton obj4=Singleton.getInstance();
		
		
		System.out.println(Singleton.counter);
		
		Hello h1=new Hello();
		Thread.sleep(500);
		Hi hi1=new Hi();
		
		h1.start();
		hi1.start();
		
		h1.join();
		hi1.join();
		
		
		
	}
}


class IllegalAgeException extends Exception{
	IllegalAgeException(String message){
	      super(message);
	}
}

class Hello extends Thread{
	@Override
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception ex){}
		}
	}
}

class Hi extends Thread{
	@Override
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception ex){}
		}
	}
}
