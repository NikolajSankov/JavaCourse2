package telran.computer.entity;

public class Laptop extends Computer {
	
	private int weight;
	private int hours;
	
	public Laptop(int ram, int hdd, String cpu, String brand, int weight, int hours) {
		super(ram, hdd, cpu, brand);
		this.weight = weight;
		this.hours = hours;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Laptop [weight=" + weight + ", hours=" + hours + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + hours;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (hours != other.hours)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	
	
	
}
