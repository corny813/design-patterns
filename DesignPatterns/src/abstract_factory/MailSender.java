package abstract_factory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("mail send...");
	}

}
