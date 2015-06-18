package factory_method;

public class FileSender implements Sender{

	@Override
	public void send() {
		System.out.println("file send...");
	}
}
