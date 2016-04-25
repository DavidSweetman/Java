
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMessage email = new EmailService();
		IMessage sms = new SMSService();
		
		Person p = new Person(email);
		p.firstname = "David";
		
		p.sendMessage("email1", "email2", p.firstname);
		
		Person p2 = new Person(sms);
		p2.firstname = "Jamie";
		p2.sendMessage("0872824388", "0872128878", p2.firstname);
	}

}
