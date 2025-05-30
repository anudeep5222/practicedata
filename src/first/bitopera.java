package first;

public class bitopera {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println("a&b="+(a&b));
		System.out.println("a|b"+(a|b));
		System.out.println("a^b"+(a^b));
		System.out.println("~a="+(~a));
		// TODO Auto-generated method stub
		System.out.println("a<<1="+(a<<1));
		
		System.out.println("a>>1="+(a>>1));
		
		System.out.println("a>>>1="+(a>>>1));
		int num=8;
		System.out.println(num+"is even "+((num & 1)==0));

	}

}
