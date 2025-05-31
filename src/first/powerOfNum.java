package first;

public class powerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int expo=2;
		int res=1;;
		while(expo!=0) {
			res=res*num;
			--expo;
		}
		System.out.println(res);

	}
}