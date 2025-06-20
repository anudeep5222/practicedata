package first;

public class fiboWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=10;
		int first=0, second=1;
		while(i<=n) {
			System.out.println(first +" ");
			int next=first + second;
			first=second;
			second=next;
			i++;
		}

	}

}
