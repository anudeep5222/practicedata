package first;

public class bintoDeci {

	public static void main(String[] args) {
		String binn="10101010";
		int power=0;
		int decimal=0;
		for(int i=binn.length()-1;i>=0;i--) {
			if(binn.charAt(i)=='1') {
				decimal+=Math.pow(2,power);
			}
			power++;
		}
		System.out.println(decimal);
		// TODO Auto-generated method stub

	}

}
