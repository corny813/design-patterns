package singleton;

/**
 * Thread-safe Singleton class.
 * The instance is lazily initialized and thus needs synchronization
 * mechanism.
 * @author corny
 * 
 */
public class Commander2 {

	private Commander2(){
	}

	private static Commander2 instance = null;
	
	public synchronized static Commander2 getInstance(){
		if(instance == null){
			instance = new Commander2();
			
			//sleep for test
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}
