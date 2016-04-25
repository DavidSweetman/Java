
import java.io.InputStreamReader;
import java.util.Scanner;

public class CircleArea {
	private double area;
	private double radius;
	
	public CircleArea(double radius){
		this.radius = radius;
		this.area = Math.PI*radius*radius;
	}
	
	public double area(){
		return this.area;
		
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("Reading int from console in Java");
		double number = scanner.nextInt();
		scanner.close();
		
		CircleArea ca = new CircleArea(number);
		System.out.println(ca.area);
		
	}

}
