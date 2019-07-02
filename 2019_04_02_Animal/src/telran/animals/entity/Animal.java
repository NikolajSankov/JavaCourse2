package telran.animals.entity;

public abstract class Animal {
	
	private int lenght;
	private int height;
	private int age;
	private String name;
	
	public Animal(int lenght, int height, int age, String name) {
		super();
		this.lenght = lenght;
		this.height = height;
		this.age = age;
		this.name = name;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Animal [lenght=" + lenght + ", height=" + height + ", age=" + age + ", name=" + name + "]";
	}
	public abstract void voice();
	public abstract void moving();
	
}
