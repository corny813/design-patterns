package factory_method;

public class MailFactory implements SenderFactory {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
