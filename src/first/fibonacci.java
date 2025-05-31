package first;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int first =0, second=1;
		System.out.println("fibonacci series"+first/n+" "+second);
		for(int i=1;i<n;i++) {
			int next=first+second;
			System.out.println(next);
			first=second;
			second=next;
			
		}

	}

}
