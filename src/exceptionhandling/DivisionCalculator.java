package exceptionhandling;

public class DivisionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=divide(10,0);
			System.out.println("result"+result);
			
		}
		catch(ArithmeticException e){
			System.out.println("error"+e.getMessage());
			
		}
		

	}
	public static int divide(int a,int b) {
		return a/b;
		
	}

}
