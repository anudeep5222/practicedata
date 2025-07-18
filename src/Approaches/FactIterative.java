package Approaches;

public class FactIterative {

	public static int factorial(int n) {
		
		
		if(n==1) {
			return n;
		} 	
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=i*fact;
			
		}
		return fact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(factorial(n));
	

	}

}
