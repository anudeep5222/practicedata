package recursion;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		fun(a);

	}
	public static void fun(int x) {
		if(x>0) {
			fun(--x);
			System.out.println(x+ " ");
			fun(--x);
		}
	}

}
