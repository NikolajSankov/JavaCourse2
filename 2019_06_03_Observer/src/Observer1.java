public class Observer1 implements Observer {

	@Override
	public void handleEvent() {
		System.out.println("Observer1 received message: Observed class has new states");
	}
	
	
}
