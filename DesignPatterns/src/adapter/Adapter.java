package adapter;

/**
 * 类的适配器模式：将一个类转换成满足另一个接口的类
 * target接口有函数method1,method2; 因为source有同名函数method1，所以可以不重写method1
 * @author corny
 *
 */
public class Adapter extends Source implements Target{

	@Override
	public void method2() {
		System.out.println("method 2");
	}
}
