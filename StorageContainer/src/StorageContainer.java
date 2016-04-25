
public class StorageContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Student s1 = new Student ("Stuart");
		Student s2 = new Student ("Joe");
		Student s3 = new Student ("Fred");
		
		IStorage container = new ContainerOfStorage();
		container.add(s1);
		container.add(s2);
		container.add(s3);
		System.out.println(container.size());

	}

}
