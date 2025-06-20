package first;

public class passwordCcheck {
	public static String passwordStrength(String password) {
		
		int num=password.length();
		if(num<8) {
			return "password should contain atleast 8 characters";
			
		}
		boolean hasUpper=false;
		boolean hasLower=false;
		boolean hasDigit=false;
		boolean hasSpecial=false;
		char[] passwordchar=password.toCharArray();
		int strength=0;
		
		for(int i=0;i<passwordchar.length;i++) {
			if(Character.isUpperCase(passwordchar[i]))
			{
				
				hasUpper=true;
				
			}
			else if(Character.isLowerCase(passwordchar[i]))
			{
				
				hasLower=true;
				
			}
			else if(Character.isDigit(passwordchar[i]))
			{
				
				hasDigit=true;
				
			}
			else if(Character.isLetterOrDigit(passwordchar[i]))
			{
				
				hasSpecial=true;
				
			}
			
			strength++;
			
		}
		if(strength>=5) {
			return "Strong" ;
		}
		else if(strength>=3 && strength <=4){
			return "medium";
		}
		else {
			return "weak";
		}
	}
	public static void main(String[] args) {
		System.out.println(passwordStrength("Anudeep@ "));
		
	}

}
