package abstract_factory;

public interface AbstractFactory {

	Sender produceSender(); 
	Receiver produceReceiver();
}
