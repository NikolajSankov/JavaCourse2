public class Main {      // nur Name von class
	
	public static void main(String[] agrs) {
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		Bus bus4 = new Bus("M400");
		
		bus1.setNumber("M100");
		bus2.setNumber("M200");
		bus3.setNumber("M300");
		
		Bus[] buses= {bus1, bus2, bus3, bus4};
		for(int i=0;i<buses.length; i++) {
			buses[i].start();
			buses[i].printBus();
		}
		
		System.out.println("*************************************");
		
		bus1.speedUp();
		bus2.speedDown();
		
		bus1.printBus();
		bus2.printBus();
		bus3.printBus();
		
		bus3.stop();
		
		bus3.printBus();
		
		bus3.printBus();
		
		
	}	
	
}
