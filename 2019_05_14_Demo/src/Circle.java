public class Circle extends Shape{
	private static double PI = 3.14;
	
	private double radius;
	
	public Circle(String name, double r) {
		super(name);
		System.out.println("Hello World from Circle");
		this.radius = r;
	}
	
	@Override
	public double calculateShape() {
		return PI*radius*radius;
	}
}
