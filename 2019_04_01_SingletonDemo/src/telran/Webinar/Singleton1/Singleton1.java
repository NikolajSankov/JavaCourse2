package telran.Webinar.Singleton1;

public class Singleton1 {
	public final static Singleton1 INSTANCE = new Singleton1();
	public int test;
	
	
	private Singleton1() {System.out.println("Singleton1 created");}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		Singleton1 obj1 = Singleton1.INSTANCE;
		Singleton1 obj2 = Singleton1.INSTANCE;
		
		obj1.test=1;
		obj2.test=2;
		
		System.out.println(obj1.test);
		
		
		
	}
	
}
