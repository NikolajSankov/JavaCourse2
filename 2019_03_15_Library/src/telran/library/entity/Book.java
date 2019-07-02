package telran.library.entity;

import java.util.Arrays;

public class Book {
	
	private String title;
	private String[] authors;
	private int page;
	private int isbn;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Book(String title, String[] authors, int page, int isbn) {
		super();
		this.title = title;
		this.authors = authors;
		this.page = page;
		this.isbn = isbn;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + Arrays.toString(authors) + ", page=" + page + ", isbn=" + isbn
				+ "]";
	}
	
	
}
