import java.util.ArrayList;

public class Storage {
	
	ArrayList<Student> studentList = new ArrayList <Student>();
	
	public void add(Student s){
		studentList.add(s);
	}
	
	public Student get(int pos){
		return studentList.get(pos);
	}

	public String Display(int pos, String password){
		
		Student s = this.get(pos);
		if (s.Password.equals(password)){
			
			return Integer.toString(s.Result);
			
		}else{
			return "Wrong Password";
		}
		
		
		
	}
	
}
