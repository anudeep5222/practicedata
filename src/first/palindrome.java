package first;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check="madam";
		String rev="";
		boolean ispalindrome=true;
		for(int i=check.length()-1;i>=0;i--) {
			rev=rev+check.charAt(i);	
			
		}
		if(check.equals(rev)) {
			ispalindrome=true;
		}
		else {
			ispalindrome=false;
		}
		System.out.println(ispalindrome);
		

	}

}
