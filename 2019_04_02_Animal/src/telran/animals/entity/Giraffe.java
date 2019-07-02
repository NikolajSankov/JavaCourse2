package telran.animals.entity;

public class Giraffe extends Animal {
	
	private int plusheight;

	public Giraffe(int lenght, int height, int age, String name, int plusheight) {
		super(lenght, height, age, name);
		this.plusheight = plusheight;
	}

	public int getPlusheight() {
		return plusheight;
	}

	public void setPlusheight(int plusheight) {
		this.plusheight = plusheight;
	}

	@Override
	public String toString() {
		return "Giraffe [plusheight=" + plusheight + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Breeeee");
		
	}

	@Override
	public void moving() {
		System.out.println(60);
		
	}
	
	
	
}
