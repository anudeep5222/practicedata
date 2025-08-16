package oopsConcept;
public class Book {
	private String author;
	private String Title;
	private boolean isBorrowed;
	
	public Book(String author,String Title) {
		this.author=author;
		this.Title=Title;
		this.isBorrowed=false;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void borrow() {
		isBorrowed=true;
	}
	public void returnBook() {
		isBorrowed=false;
		
	}
	public String GetTitle() {
		return Title;
	}
	
	  

}
