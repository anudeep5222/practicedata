package first;

public class emailFormat {
	public static  boolean Emailformat(String email) {
		String regex ="^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
			return email.matches(regex);
	}

	public static void main(String[] args) {
		System.out.println(Emailformat("@anudeepgmail.com"));
		// TODO Auto-generated method stub
		

	}

}
