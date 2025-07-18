package Approaches;


public class ReverseBuilder {
    public static String reverse(String input) {
       
        StringBuilder sb = new StringBuilder(input);
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        System.out.println("Reversed string: " + reverse(original)); 
    }
}
