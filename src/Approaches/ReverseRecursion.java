package Approaches;

public class ReverseRecursion {
    public static String reverse(String str) {
       
        if (str.length() <= 1) {
            return str;
        }        
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String original = "hello";
        System.out.println(reverse(original));  
    }
}
