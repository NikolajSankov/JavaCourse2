public abstract class Plant {
	
	public static void main(String[] args) {
		Tree t1 = new Tree();
		Flower f1 = new Flower();
		
		t1.doSpring();
		t1.doSummer();
		t1.doFall();
		t1.doWinter();
		
		f1.doSpring();
		f1.doSummer();
		f1.doFall();
		f1.doWinter();
		
	}
	
	public abstract int age(int age);
	public abstract int height(int height);
	public abstract int growthRate(int growthRate);
 	public abstract String displayName(String displayName);
	
	public abstract void doSpring();
	public abstract void doSummer();
	public abstract void doFall();
	public abstract void doWinter();
	
	
}
