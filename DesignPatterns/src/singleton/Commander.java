package singleton;

/**
 * Singleton class
 * Eagerly initialized static instance guarantees thread safety.
 * 
 * @author corny
 *
 */
public class Commander {

	private Commander(){
	}

	private static Commander instance = new Commander();
	
	public static Commander getInstance(){
		
		//sleep for test
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
}
