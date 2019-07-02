
public class Bus {
	private String number;
	private int capacity;
	private double speed=0;
	private double maxSpeed=200;
	//Driver driver;
	
	public Bus() {}
	
	public Bus(String number) {
		this.number=number;
	}
	
	void start() {
		speed=20.0;
	}
	
	void speedUp() {
		speed+=10;
	}
	
	void speedDown() {
		if(speed<maxSpeed) {
			speed-=10;
		}
	}
	
	void setNumber(String num) {
		number=num;
	}
	
	void stop() {
		speed=0.0;
	}
	
	void printBus() {
		System.out.println("The bus No "+number +" speed is -" +speed);
	}
	
	
}

