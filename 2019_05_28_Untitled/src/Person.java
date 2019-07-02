public class Person implements Comarable<Person>{
	
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Person o) {
		if(age > o.age) {
			return 1;
		}
		if(age < o.age) {
			return -1;
		}
		return 0;
	}
}
