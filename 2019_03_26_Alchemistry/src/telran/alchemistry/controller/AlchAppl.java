package telran.alchemistry.controller;

import telran.alchemistry.dao.MagicStorage;
import telran.alchemistry.enity.*;

public class AlchAppl {

	public static void main(String[] args) {
		
		Gold g1 = new Gold("Party Gold", 1, 34);
		Gold g2 = new Gold("Pirate Gold", 1, 50);
		
		Shit sh1 = new Shit("Dog shit", 2, 2);
		Shit sh2 = new Shit("Elefant shit", 3, 1000);
		
		MagicStorage ms1 = new MagicStorage(4);
		ms1.addSubstance(g1);
		ms1.addSubstance(g2);
		ms1.addSubstance(sh1);
		ms1.addSubstance(sh2);
		
		ms1.display();
		System.out.println("***********************************");
		ms1.alchemy();
		ms1.display();
		
	}

}
