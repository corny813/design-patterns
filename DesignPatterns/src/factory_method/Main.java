package factory_method;

/**
 * 工厂方法：扩展性好
 * @author corny
 *
 */
public class Main {

	public static void main(String[] args) {
		SenderFactory factory = new MailFactory();
		factory.produce().send();
		
		new SmsFactory().produce().send();
		
		new FileFactory().produce().send();
	}
}
