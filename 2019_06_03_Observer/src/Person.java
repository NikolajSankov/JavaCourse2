public class Person implements Observer{
	String name;

	@Override
	public void handleEvent() {
		System.out.println("Person "+ name + "reserved message");
	}
}
