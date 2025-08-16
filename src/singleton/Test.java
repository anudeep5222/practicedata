package singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Single n=new Single();
//		Single n1=new Single();
//		System.out.println(n.hashCode());
//		System.out.println(n1.hashCode());
		Single s1=Single.getInstance();
		Single s12=Single.getInstance();
		System.out.println(s1);
		System.out.println(s12);

	}

}
