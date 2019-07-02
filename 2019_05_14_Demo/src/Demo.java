
public class Demo {
	
	public static double PI = 3.14;
	
	public static void main(String[] args) {
		Shape s = new Circle("test", 10);
		Shape r = new Rectangle("test2", 10, 15);
		System.out.println(s.calculateShape());
		System.out.println(r.calculateShape());
	}
	
	public static double calculateCircleSquare(double r) {
		return PI*r*r;
	}
	
	public static double calculateRectangleSquare(double a, double b) {
		return a*b;
	}
	
	
}
