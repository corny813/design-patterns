package decorator;

/**
 * 增强原有类的功能
 * @author corny
 *
 */
public class Decorator implements ISource {

	private Source source;
	
	public Decorator(Source s){
		this.source = s;
	}
	
	@Override
	public void method() {
		System.out.println("before method");
		source.method();
		System.out.println("after method");
	}
}
