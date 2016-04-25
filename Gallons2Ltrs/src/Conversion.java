
public class Conversion {
	private double gallon2ltr = 3.78, ltr2gallon = 0.264, volume;
	public char type;
	
	public Conversion(char type){
		this.type = type;
	}
	
	public double g2l(double volume)
	{
		return this.gallon2ltr * volume;
	}
	
	public double l2g(double volume)
	{
		return this.ltr2gallon * volume;
	}
	
	
	public static void main(String[] args) {
		Conversion c = new Conversion();
		
				
		

	}

}
