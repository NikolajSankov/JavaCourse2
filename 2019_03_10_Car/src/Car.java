public class Car {
	private String brand;
	private String model;
	private double maxSpeed;
	private double power;
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public double getPower() {
		return power;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	public void setPower(double power) {
		this.power=power;
	}
	public void display() {
		System.out.println("Car");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("MaxSpeed: "+maxSpeed);
		System.out.println("Power: "+power);		
	}
}
