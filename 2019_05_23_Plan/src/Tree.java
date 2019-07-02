public class Tree extends Plant {
	
	
	public void doSpring() {
		
		
	}
	
	@Override
	public void doFall() {
		
	}
	
	@Override
	public void doSummer() {
		
		
	}
	
	@Override
	public void doWinter() {
		
		
	}

private int growthRate;
	
	@Override
	public int growthRate(int growthRate) {
		this.growthRate=growthRate;
		return 0;
	}
	private int age;
	
	@Override
	public int age(int age) {
		this.age=age;
		return 0;
	}
	private int height;
	@Override
	public int height(int height) {
		this.height=height;
		return 0;
	}
	private String displayName;
	@Override
	public String displayName(String displayName) {
		this.displayName=displayName;
		return null;
	}
	
}
