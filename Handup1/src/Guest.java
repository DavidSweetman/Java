//Guest extends Parent Person and implements IAttendee interface
public class Guest extends Person implements IAttendee {
	
	public String contact;
	public String company;
	
	//Constructor
	public Guest(IMessage msg, String fname, String lname, String email, String mobile_no, String company, String contact) {
		super(msg, fname, lname, email, mobile_no);
		this.company = company;
		this.contact = contact;		
		
	}

}
