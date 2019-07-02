public abstract class Shape {
	public String name;
	
	public Shape(String name) {
		System.out.println("Hello World from Shape");
		this.name = name;
		}
	
	public abstract double calculateShape();
	
	public String getName() {
		return name;
	}
}
