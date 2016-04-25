//Contractor is like a guest except with a d.o.b. stored. Extends guest which in turn extends Person. IAttendee Interface
public class Contractor extends Guest implements IAttendee{
	
	public String dob;
	//Constructor
	public Contractor(IMessage msg, String fname, String lname, String email, String mobile_no, String company, String contact, String dob) {
		super(msg, fname, lname, email, mobile_no, company, contact);
		this.dob = dob;

	}
	
}
