package telran.alchemistry.enity;

public class Substance {
	
	private String name;
	private int density;
	public Substance(String name, int density) {
		super();
		this.name = name;
		this.density = density;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDensity() {
		return density;
	}
	public void setDensity(int density) {
		this.density = density;
	}
	@Override
	public String toString() {
		return "Substance [name=" + name + ", density=" + density + "]";
	}
	
	
}
