package telran.goats.controller;

import telran.goat.data.Goat;

public class GoatAppl {

	public static void main(String[] args) {
		
		Goat goat1 = new Goat();
		goat1.name = "Rex";
		
		for(int i=0; i<10; i++) {
			goat1.count = goat1.count+1;
		}
		
		System.out.println(goat1.name);
		System.out.println(goat1.count);
		
		Goat goat2 = new Goat();
		goat2.name="Fox";
		
		for(int i=0; i<10; i++) {
			goat2.count=goat2.count+10;
		}
		System.out.println(goat2.name);
		System.out.println(goat2.count);
		
		Goat goat3= new Goat();
		goat3.name="BoomBox";
		
		for(int i=0; i<10; i++) {
			goat3.count = goat3.count+1;
		}
		System.out.println(goat3.name);
		System.out.println(goat3.count);
		
		
		
		
	}

}
