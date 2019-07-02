package telran.animals.controller;

import telran.animals.data.Animal;
import telran.animals.data.ArrayTools;

public class AnimalAppl {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Sharik", "dog", "Dyada Fedor", 1977, false);
		Animal a2 = new Animal("Bobik", "Pig", 1999, true);
		Animal a3 = new Animal("Horse", 2005, false);
		
		Animal arr[] = {a1, a2, a3};
		
		ArrayTools.printArray(arr);
		
	}

}
