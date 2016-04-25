
public class Person {
	public String firstname;
	public String lastname;
	public String email;
	public String mobile_no;
	
	
	private IMessage msg = null;
	
	public Person(IMessage msg){
		this.msg = msg;
	}
	public void sendMessage(String msg_from, String msg_to, String message){
		msg.sendMessage(msg_from, msg_to, message);
	}
}
