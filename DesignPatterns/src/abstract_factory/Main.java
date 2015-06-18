package abstract_factory;

/**
 * ���󹤳�:����Intel����cpu,���壻AMDҲ����cpu,����,
 * 		     ���ڳ��󹤳�����Զ���cpu,�����produce����
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
