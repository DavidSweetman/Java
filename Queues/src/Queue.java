import java.util.ArrayList;

public class Queue implements IQueue{
	
	private ArrayList<String> myQueue = new ArrayList<String>();
	

	public void enqueue(String s) {
		myQueue.add(s);
		
	}

	
	public String dequeue() {
		return myQueue.remove(0);
	}

	
	public int size() {
		int size = myQueue.size();
		return size;
	}

	
	public boolean isEmpty() {
		if (myQueue.isEmpty()){
			return true;}
		else{
			return false;}
		
	}

	
	public String elementAt(int i) {
		
		return myQueue.get(i);
	}
	
}
