package telran.animals.controller;

import telran.animals.entity.Animal;
import telran.animals.entity.Barashka;
import telran.animals.entity.Cat;
import telran.animals.entity.Dog;
import telran.animals.entity.Giraffe;

public class AnimalApp {

	public static void main(String[] args) {
		
		Dog d1 = new Dog(50, 30, 5, "Scharik", 25);
		Cat c1 = new Cat(15, 9, 15, "Garfield", 72);
		Barashka b1 = new Barashka(50, 20, 10, "Ship", 50);
		Giraffe g1 = new Giraffe(100, 150, 13, "Bobik", 150);
		
		Animal[] animals = new Animal[4];
		animals[0] = d1;
		animals[1] = c1;
		animals[2] = b1;
		animals[3] = g1;
		
		cantata(animals);
		
	}
	
	public static void cantata(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			animals[i].voice();
		}
	}

}
