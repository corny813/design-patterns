package abstract_factory;

/**
 * 抽象工厂:例如Intel生产cpu,主板；AMD也生产cpu,主板,
 * 		     则在抽象工厂里可以定义cpu,主板的produce方法
 * @author corny
 *
 */
public class Main {

	public static void main(String[] args) {
		Factory1 fac1 = new Factory1();
		fac1.produceReceiver().receive();
		fac1.produceSender().send();
		
		Factory2 fac2 = new Factory2();
		fac2.produceReceiver().receive();
		fac2.produceSender().send();
		
	}
}
