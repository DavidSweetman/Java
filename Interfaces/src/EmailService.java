
public class EmailService implements IMessage{
	
	public void sendMessage(String msg_from, String msg_to, String message){
		System.out.println("The Message sent was " + message);
	}
}