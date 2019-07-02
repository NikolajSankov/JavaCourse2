public class SuperBossDemo {
	
	public static void main(String[] args) {
		SuperBoss superBoss = SuperBoss.getSuperBoss("Ivan");
			
		SuperBoss sb2 = SuperBoss.getSuperBoss("Ivan");
		
		System.out.println(superBoss);
		System.out.println(sb2);
		
	}
}
