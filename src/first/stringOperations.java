package first;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="world";
		String result=str1+str2;
		System.out.println(result);
		System.out.println("LENGHTHOFSTRING "+ str1.length());
		System.out.println("character at index 1 "+ str1.charAt(1));
		System.out.println("substring of string "+str1.substring(3));
		System.out.println("comparision of a string "+str1.equals(str2));
		System.out.println("comparision of string ignore case "+str1.equals(str2));
        System.out.println("case conversion from upper  "+str1.toUpperCase());
        System.out.println("case conversion to lower "+str2.toLowerCase());
        System.out.println("replace the characters in a string"+str1.replace('e','t'));
	}

}
