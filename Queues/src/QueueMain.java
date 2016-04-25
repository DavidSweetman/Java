
public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue("Spring");
		q.enqueue("Summer");
		q.enqueue("Autumn");
		q.enqueue("Winter");
		
		System.out.println(q.isEmpty());
		
		
		String x = q.elementAt(3);
		System.out.println(x);
		

	}

}
