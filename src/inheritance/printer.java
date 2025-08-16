package inheritance;

public class printer {
	public void print(String message) {
		System.out.println(message);
	}
	public void print(int copies,String message) {
		System.out.println(copies+" "+message);
	}
	public void print() {
		System.out.println("nothing to print");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer[] jj=new printer[3];
		jj[0]=new printer();
		jj[0].print("hi there how can i help you");
		jj[1]=new printer();
		jj[1].print(2,"hello your total copies are");
		jj[2]=new printer();
		jj[2].print();
	    
		
		

	}

}
