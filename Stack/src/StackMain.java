
public class StackMain {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("John");
		s.push("Ringo");
		s.push("Paul");
		s.push("George");
		
		s.pop();
		
		System.out.println(s.size());
	}

}
