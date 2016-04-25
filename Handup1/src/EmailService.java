// Messaging service using email. Just using a println() to show that method is being called
public class EmailService implements IMessage{
	
	//Dummy Method
	public void sendMessage(String to, String from, String message){
		System.out.println("Sending email");
	}

}
