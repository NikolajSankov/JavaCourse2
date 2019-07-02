public class Rectangle extends Shape {
	public static double PI = 3.14;
	
	public double a;
	public double b;
	
	public Rectangle(String name, double a, double b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double calculateShape() {
		return PI*a*b;
	}
	
}
