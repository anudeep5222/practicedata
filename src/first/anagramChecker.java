package first;

import java.util.Arrays;

public class anagramChecker {
	public static boolean anagramcheck(String str1,String str2) {
		str1=str1.replaceAll("\\s","");
		str2=str2.replaceAll("\\s","");
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] str1char=str1.toCharArray();
		char[] str2char=str2.toCharArray();
		Arrays.sort(str1char);
		Arrays.sort(str2char);
		return (Arrays.equals(str1char,str2char)); 
		
		
	}

	public static void main(String[] args) {
		System.out.println(anagramcheck("listen","silent"));
		
		
	

	}

}
