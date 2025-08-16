package inheritance;

public class book extends LibraryItem {
	private String author;
	private String genre;
	public book(String author,String genre,String title,int itemId) {
		super(title,itemId);
		this.author=author;
		this.genre=genre;
	}
	public String getauthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
		
	}
	public String getgenre() {
		return genre;
	}
	public void setgenre(String genre) {
		this.genre=genre;
	}
	@Override
	void checkOut() {
		System.out.println("book checkout "+gettitle());
		// TODO Auto-generated method stub
		
	}
	@Override
	void returnItem() {
		System.out.println("book reurned "+gettitle());
		// TODO Auto-generated method stub
		
	}
	

}
