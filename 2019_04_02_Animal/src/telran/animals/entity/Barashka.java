package telran.animals.entity;

public class Barashka extends Animal {
	
	private int furlevel;

	public Barashka(int lenght, int height, int age, String name, int furlevel) {
		super(lenght, height, age, name);
		this.furlevel = furlevel;
	}

	public int getFurlevel() {
		return furlevel;
	}

	public void setFurlevel(int furlevel) {
		this.furlevel = furlevel;
	}

	@Override
	public String toString() {
		return "Barashka [furlevel=" + furlevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Mäh-Mäh");
		
	}

	@Override
	public void moving() {
		System.out.println("10");
		
	}
	
	
}
