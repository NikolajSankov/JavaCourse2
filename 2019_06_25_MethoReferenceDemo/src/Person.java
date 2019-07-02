
public class Person {
	String name;
	int age;
	
	public Person(String name, int age, Adress adress) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	Adress adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	BankAccount bankaccount;
	
	
	
}
