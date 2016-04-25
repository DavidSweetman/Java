//Contractor extends the Parent Person class and implements the IAttendee interface
public class GeneralEmployee extends Person implements IAttendee{
	
	public String dob;
	public Double salary;
	public String title;
	
	//Constructor
	public GeneralEmployee(IMessage msg, String fname, String lname, String email, String mobile_no, String dob, Double salary, String title) {
		super(msg, fname, lname, email, mobile_no);
		this.title = title;
		this.dob = dob;
		this.salary = salary;
		
	}
 
}
