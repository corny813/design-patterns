package adapter;

/** 
 * 对象的适配器模式：将一个对象转换成满足另一个接口的对象
 * @author corny
 *
 */
public class Wrapper implements Target{

	private Source source;
	
	public Wrapper(Source source){
		this.source = source;
	}
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("method 2---wrapper");
	}

}
