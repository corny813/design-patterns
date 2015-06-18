package factory_method;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("mail send...");
	}

}
