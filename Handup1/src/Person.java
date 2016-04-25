//Base class holding methods and attributes that all the guests share. Can be used as a base for future types of guests.

public class Person implements IAttendee{
	public String firstname;
	public String lastname;
	public String email;
	public String mobile_no;
	public IMessage msg;
	
	
	//Constructor
	public Person(IMessage msg, String fname, String lname, String email, String mobile_no){
		this.firstname = fname;
		this.lastname = lname;
		this.email = email;
		this.mobile_no = mobile_no;
		this.msg = msg;
		
	}
	
	//Method to contact a Person using their messaging service
	public void contact(String msg_from, String msg_to, String message){
		msg.sendMessage(msg_from, msg_to, message);
	}
	
	
	//Method to get the contact
	public String getContact(){
		if (this.msg instanceof EmailService){
			return this.email;
		}else{
			return this.mobile_no;
		}
		
		//I don't think this  if/else works as they are instances of IMessage
		//If I had more time I would assign each attendee a boolean for optEmail and optSms
		//I would get the relevant contact info from whatever one was set to true. 
	}
	
}
