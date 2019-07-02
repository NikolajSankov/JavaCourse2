package telran.animals.data;

public class Animal {
	
	private String name;
	private String type;
	private String owner;
	private int year;
	private boolean gender;
	
	
	public Animal(String name, String type, String owner, int year, boolean gender) {
		super();
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.year = year;
		this.gender = gender;
	}

	public Animal(String name, String type, int year, boolean gender) {
		super();
		this.name = name;
		this.type = type;
		this.year = year;
		this.gender = gender;
	}

	public Animal(String type, int year, boolean gender) {
		super();
		this.type = type;
		this.year = year;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", owner=" + owner + ", year=" + year + ", gender=" + gender
				+ "]";
	}
}




