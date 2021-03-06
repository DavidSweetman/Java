
public class Node {

	private IPerson patient;
	private Node next;
	private int priority;
	private Node prev;
	
	public Node (IPerson patient, Node prev, Node next, int priority){
		this.patient = patient;
		this.next = next;
		this.priority = priority;
		this.setPrev(prev);
		
	}
	
	public int getPriority(){
		return priority;
	}
	
	public void setPriority(int priority){
		this.priority = priority;
	}
	
	
	
	public IPerson getPatient(){
		return patient;
	}
	
	public void setPatient(IPerson patient){
		this.patient = patient;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
}
