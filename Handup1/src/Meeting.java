// Class to create Meetings. They implement IEvent. The storage objects are passed in at construction and depend on interface

public class Meeting implements IEvent{

	public IStorage storage;
	private String eventName;
	public String eventContact;
	private String message;
	
	//Constructor
	public Meeting(String eventName, String eventContact, IStorage aList, String message) {
		this.eventName = eventName;
		this.eventContact = eventContact;
		this.storage = aList;
		this.message = message;
		
	}
	
	//Method to call the contact method for the Storage class for this meeting
	public void ContactMembers(){
		System.out.println("Contacting attendees to thank for attendance");
		this.storage.contactList(eventContact, this.message + eventName);	
		}
	

}
