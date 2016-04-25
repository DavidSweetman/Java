
public class CalculateArea {

	public double area(Square[] shapes){
		double area = 0;
		
		for (Square s : shapes){
			area = area + (s.height*s.width);
		}
		return area;
	}
}
