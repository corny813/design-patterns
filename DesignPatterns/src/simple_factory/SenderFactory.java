package simple_factory;

public class SenderFactory {
	
	public Sender produce(String type){
		
		if(type.equals("sms")){
			return new SmsSender();
		}else if(type.equals("mail")){
			return new MailSender();
		}else{
			System.out.println("Please input right type: ");
			return null;
		}
	}
}
