package classMethods;

public class Rectangle {
	int width;
	int height;
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return height * width;
	}
	public int perimeter() {
		return 2*(height + width);
	}
	public boolean getsquare() {
		if(height==width) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(5,11);
		System.out.println(rec1.perimeter());
		// TODO Auto-generated method stub
		System.out.println(rec1.getArea());
		System.out.println(rec1.getsquare());

	}

}
