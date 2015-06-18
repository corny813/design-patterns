package simple_factory;

/**
 * 简单工厂：类的创建依赖工厂类，如果要扩展需要修改工厂类，违背了开闭原则。
 * @author corny
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//01：工厂类只有一个生产方法，通过不同参数产生不同类型
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.send();
		
		//02: 工厂类有多个方法，不同方法产生不同类
		SenderFactory2 factory2 = new SenderFactory2();
		factory2.produceMail().send();
		
		//03: 静态方法，不用生成工厂实例
		SenderFactory3.produceMail().send();
	}
}
