package first;

public class Removeduplicatevalues {
	public static String removeDups(String str) {
		StringBuilder result =new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(result.indexOf(String.valueOf(ch))==-1) {
				result.append(ch);
				
			}

		}
		return result.toString();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="programming";
		System.out.println("original" +input);
		System.out.println("after removing duplicates "+removeDups(input));
		

	}

}
