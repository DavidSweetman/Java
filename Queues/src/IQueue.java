
public interface IQueue {
	public void enqueue(String s);
	public String dequeue();
	public int size ();
	public boolean isEmpty();
	public String elementAt(int i);
}
