package telran.library.dao;

import telran.library.entity.Book;

public class Library {
	
	private Book[] books;
	private int currentSize;
	
	public Library(int capacity) {
		books=new Book[capacity];
		currentSize=0;
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	
	public boolean addBook(Book book) {
		if(currentSize<books.length) {
			books[currentSize]=book;
			currentSize++;		
			return true;
		}
		return false;
	}
	public boolean removeBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if(books[i].equals(book)) {
				books[i]=books[currentSize-1];
				currentSize--;
				return true;
			}
		}
		return false;
	}
	public void display() {
		for (int i = 0; i < currentSize; i++) {
			System.out.println(books[i]);
		}
		
	}
	
	

	
	
	
	
}
