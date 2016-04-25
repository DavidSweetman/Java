
public interface IStorage {
	
	
	public void add(IPerson p, int priority);
	public void remove(int position);
	public int getPosition(Node n);
	public Node getHighestPriority();
	public Node getNode(int i);
	public int getSize();
	
	

}
