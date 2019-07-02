package telran.alchemistry.enity;

public class Shit extends Substance {
	
	private int volume;

	public Shit(String name, int density, int volume) {
		super(name, density);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Shit [volume=" + volume + ", toString()=" + super.toString() + "]";
	} 
	
}