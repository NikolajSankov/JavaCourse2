package telran.animals.entity;

public class Cat extends Animal {
	
	private int sctratchlevel;

	public Cat(int lenght, int height, int age, String name, int sctratchlevel) {
		super(lenght, height, age, name);
		this.sctratchlevel = sctratchlevel;
	}

	public int getSctratchlevel() {
		return sctratchlevel;
	}

	public void setSctratchlevel(int sctratchlevel) {
		this.sctratchlevel = sctratchlevel;
	}

	@Override
	public String toString() {
		return "Cat [sctratchlevel=" + sctratchlevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Miao-Miao");
	}

	@Override
	public void moving() {
		System.out.println(25);
	}
	
	
}
