
public class Adress {
	String street;
	int houseNumber;
	public Adress(String street, int houseNumber) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
	}
	@Override
	public String toString() {
		return "Adress [street=" + street + ", houseNumber=" + houseNumber + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
}
