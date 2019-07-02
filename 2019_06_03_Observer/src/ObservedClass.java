import java.util.ArrayList;
import java.util.List;

public class ObservedClass implements Observable{
	private String state;
	
	private List<Observer> observerList = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {

		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observerList) {
			observer.handleEvent();
		}
	}
	
	public void stateChanged(String state) {
		this.state = state;
		System.out.println("Notify observers: new state is "+ state);
		this.notifyObservers();
	}
}
