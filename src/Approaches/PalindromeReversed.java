package Approaches;


public class PalindromeReversed {
    public static void main(String[] args) {
        String original = "madam";

       
        StringBuilder sb = new StringBuilder(original);

        
        String reversed = sb.reverse().toString();

       
        if (original.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
