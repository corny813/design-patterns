package abstract_factory;

public class Factory1 implements AbstractFactory{

	@Override
	public Sender produceSender() {
		return new MailSender();
	}

	@Override
	public Receiver produceReceiver() {
		return new MailReceiver();
	}

}
