package factory_method;

public class FileFactory implements SenderFactory{

	@Override
	public Sender produce() {
		return new FileSender();
	}

}
