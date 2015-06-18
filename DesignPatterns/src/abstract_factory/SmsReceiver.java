package abstract_factory;

public class SmsReceiver implements Receiver {

	@Override
	public void receive() {
		System.out.println("sms receive...");
	}
}
