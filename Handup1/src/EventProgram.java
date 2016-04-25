
//Small runnable class to check all elements work

public class EventProgram {
	
	
	public static void main(String[] args) {
		
		//Create Storage Method (ArrayList)
		IStorage storage = new AttendeeList();
		//Create Meeting and pass in storage Method
		Meeting m = new Meeting("Test Event", "0870000001", storage, "Thank you for Attending");
		
		//Create messaging service
		IMessage service = new SmsService();
		//IMessage service2 = new EmailService();
		
		//Create Attendees, passing in the messaging service they will use
		IAttendee c = new Contractor(service, "John", "Doe", "johndoe@email.com", "087000002", "JDandCo", "Jane", "" );
		IAttendee g = new GeneralEmployee(service, "John", "Doe", "johndoe@email.com", "087000002", "01/01/50", 40000.00, "Manager");
		
		if (c.)
		
		//Add members to storage and contact them to confirm.
		m.storage.AddMember(c);
		c.contact(c.getContact(), m.eventContact, "Your attendence has been confirmed");
		m.storage.AddMember(g);
		g.contact(g.getContact(), m.eventContact, "Your attendence has been confirmed");
		
		// Contact Members when even ends
		m.ContactMembers();
		
		

	}

}
