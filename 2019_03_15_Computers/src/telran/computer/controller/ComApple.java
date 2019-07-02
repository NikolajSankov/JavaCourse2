package telran.computer.controller;

import telran.computer.entity.Computer;
import telran.computer.entity.Laptop;
import telran.computer.entity.SmartPhone;

public class ComApple {
	
	public static void main(String[] args) {
	Computer c1 = new Computer(12, 120, "Intel", "Lenovo");
	System.out.println(c1);
	
	Laptop l1 = new Laptop(16, 160, "AMD", "Apple", 1, 9);
	System.out.println(l1);
	
	SmartPhone sm1 = new SmartPhone(12, 1000, "Samsung", "Samsung", 123456);
	System.out.println(sm1);
	
	boolean res1 = c1.equals(l1);
	System.out.println(res1);
	Laptop l2 = new Laptop(16, 160, "AMD", "Apple", 1, 9);
	boolean res2=l2.equals(l1);
	System.out.println(res2);
	
	Computer arr1[] = new Computer[3];
	arr1[0]=c1;
	arr1[1]=l1;
	arr1[2]=sm1;
	l2.setBrand("Chudo");
	String str1=l1.getClass().toString();
	System.out.println(str1);
	String str2 = l2.getBrand();
	System.out.println(str2);
	
		
	}
	
}
