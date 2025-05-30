package first;

public class nestedIf {

	public static void main(String[] args) {
		int age=25;
		boolean hasLicense=true;
		if(age>=18) {
			if(hasLicense) {
				System.out.println("eligible");
			}else {
				System.out.println("not eligible");
			}
			
		}else {
			System.out.println("you are too young");
		}
		
		// TODO Auto-generated method stub

	}

}


