import java.util.ArrayList;

public class ContainerOfStorage implements IStorage{
	private ArrayList<Student> list = new ArrayList<>();
	
	public void add(Student s){
		list.add(s);
	}
	
	public void delete(int i){
		list.remove(i);
	}
	
	public int size (){
		return list.size();
	}
}
