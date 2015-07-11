package adapter;

/** 
 * �����������ģʽ����һ������ת����������һ���ӿڵĶ���
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
