package telran.library.controller;

import telran.library.dao.Library;
import telran.library.entity.Book;

public class LibraryApp {

	public static void main(String[] args) {
		String[] authors1 = {"Karl Marx"};
		String[] authors2 = {"Friedrich Engles"};
		String[] authors3 = {"Karl Marx", "Friedrich Engles"};
		
		Book b1 = new Book("Kapital", authors1, 500, 12345);
		Book b2 = new Book("Red Hat", authors2, 356, 1215);
		Book b3 = new Book("MKP", authors3, 1, 4331);
		
		Library myLib1= new Library(10);
		myLib1.addBook(b1);
		myLib1.addBook(b2);
		myLib1.addBook(b3);
		myLib1.display();
		
		System.out.println("****************************************");
		
		myLib1.removeBook(b3);
		myLib1.removeBook(b1);
		myLib1.display();
		
	}

}
