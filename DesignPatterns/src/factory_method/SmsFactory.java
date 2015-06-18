package factory_method;

public class SmsFactory implements SenderFactory {

	@Override
	public Sender produce() {
		return new SmsSender();
	}
}
