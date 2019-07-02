package telran.computer.entity;

public class SmartPhone extends Computer {
	private int imei;

	public SmartPhone(int ram, int hdd, String cpu, String brand, int imei) {
		super(ram, hdd, cpu, brand);
		this.imei = imei;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + imei;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		if (imei != other.imei)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SmartPhone [imei=" + imei + ", toString()=" + super.toString() + "]";
	}
	
	
}
