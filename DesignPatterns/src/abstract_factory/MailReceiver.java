package abstract_factory;

public class MailReceiver implements Receiver {

	@Override
	public void receive() {
		System.out.println("mail receive...");
	}

}
