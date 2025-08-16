package inheritance;

public abstract class LibraryItem {
	String title;
	
	int itemId;
	public LibraryItem(String title,int itemId) {
		this.title=title;
		this.itemId=itemId;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public int getitemId(int itemId) {
		this.itemId=itemId;
		return itemId;
	}
	public void setitemId(int itemId) {
		this.itemId=itemId;
	}
	
	abstract void checkOut();
	abstract void returnItem();
	
	

}
