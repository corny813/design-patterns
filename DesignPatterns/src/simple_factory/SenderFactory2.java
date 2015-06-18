package simple_factory;

public class SenderFactory2 {

	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
}
