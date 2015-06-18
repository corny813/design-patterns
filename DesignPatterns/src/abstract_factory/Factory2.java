package abstract_factory;

public class Factory2 implements AbstractFactory {

	@Override
	public Sender produceSender() {
		return new SmsSender();
	}

	@Override
	public Receiver produceReceiver() {
		return new SmsReceiver();
	}

}
