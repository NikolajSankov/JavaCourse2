public class SuperBoss {
	
	public static SuperBoss INSTANCE;
	String name;
	
	private SuperBoss(String name) { this.name = name; }
	
	public static synchronized SuperBoss getSuperBoss(String name) {
		if(INSTANCE == null) {
			INSTANCE = new SuperBoss(name);
		}
		return INSTANCE;
	}
}
