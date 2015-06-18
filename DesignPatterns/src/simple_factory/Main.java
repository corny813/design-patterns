package simple_factory;

/**
 * �򵥹�������Ĵ������������࣬���Ҫ��չ��Ҫ�޸Ĺ����࣬Υ���˿���ԭ��
 * @author corny
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//01��������ֻ��һ������������ͨ����ͬ����������ͬ����
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.send();
		
		//02: �������ж����������ͬ����������ͬ��
		SenderFactory2 factory2 = new SenderFactory2();
		factory2.produceMail().send();
		
		//03: ��̬�������������ɹ���ʵ��
		SenderFactory3.produceMail().send();
	}
}
