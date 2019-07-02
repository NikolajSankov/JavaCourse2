package telran.animals.entity;

public class Dog extends Animal {
	
	private int smelllevel;

	public Dog(int lenght, int height, int age, String name, int smelllevel) {
		super(lenght, height, age, name);
		this.smelllevel = smelllevel;
	}

	public int getSmelllevel() {
		return smelllevel;
	}

	public void setSmelllevel(int smelllevel) {
		this.smelllevel = smelllevel;
	}

	@Override
	public String toString() {
		return "Dog [smelllevel=" + smelllevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Hav-Hav");
		
	}

	@Override
	public void moving() {
		System.out.println(50);
		
	}
	
	
}
