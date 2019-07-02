package telran.alchemistry.enity;

public class Gold extends Substance {
	
	private int weight;

	public Gold(String name, int density, int weight) {
		super(name, density);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Gold [weight=" + weight + ", toString()=" + super.toString() + "]";
	}
}
