package telran.alchemistry.dao;

import telran.alchemistry.enity.*;

public class MagicStorage {
	
	private Substance[] substances;
	private int size;
	
	public MagicStorage(int capacity) {
		substances = new Substance[capacity];
		size = 0;
	}
	
	public boolean addSubstance(Substance substance) {
		if(size<substances.length) {
			substances[size]=substance;
			size++;
			return true;
		}
		return false;
	}
	public int checkSubstance(String name) {
		for (int i = 0; i < size; i++) {  
			if(name==substances[i].getName()) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean removeSubstance(String name) {
		int index = checkSubstance(name);
		if(index<0) {
			return false;
		}
		substances[index]=substances[size-1];
		size--;
		return true;
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(substances[i]);
		}
	}
	
	public void alchemy() {
		for (int i = 0; i < size; i++) {
			if (substances[i] instanceof Shit) {
				Shit shit = (Shit)substances[i];
				Gold gold = new Gold(shit.getName(), shit.getDensity(), shit.getVolume());
				substances[i]=gold;
			}
		}
	}
}
