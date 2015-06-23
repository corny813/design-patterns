package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest implements Runnable{

	Commander cmd = null;
	Commander2 cmd2 = null;
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(20);
		int num = 10;
		while(num-- > 0){
			es.submit(new SingletonTest());
		}
		es.shutdown();
		
	}

	@Override
	public void run() {
		int num = 2;
		while(num-->0){
//			cmd = Commander.getInstance();
			cmd2 = Commander2.getInstance();
			System.out.println(Thread.currentThread().getName()+"--"+cmd2);
//			System.out.println(Thread.currentThread().getName()+"--"+this.getInstance());
		}
	}
	
	public SingletonTest getInstance(){
		return new SingletonTest();
	}
}
