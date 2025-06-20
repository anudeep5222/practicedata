package classMethods;

public class RectangleConstructor {
	

		// TODO Auto-generated method stub
		    private double width;
		    private double height;

		    // Default constructor
		    public RectangleConstructor() {
		        this.width = 0;
		        this.height = 0;
		    }

		    
		    public RectangleConstructor(double width, double height) {
		        this.width = width;
		        this.height = height;
		    }

		    
		    public RectangleConstructor(double side) {
		        this.width = side;
		        this.height = side;
		    }

		    public void display() {
		        System.out.println("Rectangle: Width = " + width + ", Height = " + height);
		    }

		    public static void main(String[] args) {
		        RectangleConstructor rect1 = new RectangleConstructor();
		        RectangleConstructor rect2 = new RectangleConstructor(10, 5);
		        RectangleConstructor rect3 = new RectangleConstructor(7);

		        rect1.display();
		        rect2.display();
		        rect3.display();
		    }

}


