//Class to create Array Lists as a method to store attendees and contact all attendees to thank them for attendance

import java.util.ArrayList;

public class AttendeeList implements IStorage{
	ArrayList<IAttendee> attendeelist;
	
	//Constructor creates ArrayList
	public AttendeeList(){
		attendeelist = new ArrayList<IAttendee>();
				
	}
	
	//Method to add an attendee, i, to the ArrayList
	public void AddMember(IAttendee i){
		attendeelist.add(i);
		System.out.println("Attendee Successfully added");
	}
	

	//Method to cycle through attendee list to contact each member
	public void contactList(String eventcontact, String message){
		for (int i = 0 ; i < this.attendeelist.size(); i++){
			IAttendee member = this.attendeelist.get(i);
			member.contact(member.getContact(), eventcontact , message);
	}
	}
}
