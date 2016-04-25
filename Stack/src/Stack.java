import java.util.ArrayList;

public class Stack implements IStack{

	private ArrayList<String> myStack = new ArrayList<String>();
	
	public void push(String s) {
		myStack.add(s);
		
	}


	public String pop() {
		
		return myStack.remove(myStack.size() -  1);
	}

	public int size() {
		
		return myStack.size();
	}


	public boolean isEmpty() {
		if (myStack.isEmpty()){
			return true;}
		else{
			return false;}
	}


	public String elementAt(int i) {
		
		return myStack.get(i);
	}
	

}
