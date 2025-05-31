package first;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		boolean isPrime=true;
		if(n<=1) {
			isPrime=false;
		}else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				isPrime=false;
				break;
			}
		}
		System.out.println(n+(isPrime ? " is prime": " is not prime"));

	}

}
