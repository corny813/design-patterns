package adapter;

/**
 * 接口适配器模式：当不希望实现一个接口的所有方法时，可以创建一个抽象类实现所有方法，再从抽象类继承
 * @author corny
 *
 */
public abstract class AbstractTarget implements Target{
	
	public void method1(){}
	public void method2(){} 
}
