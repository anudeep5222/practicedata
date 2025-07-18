package Approaches;


public class ConsecutiveRepeating {
    public static String removeDuplicates(String str) {
        if (str == null || str.length() <= 1) return str;

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0)); 

        for (int i = 1; i < str.length(); i++) {
            
            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "dddeep";
        System.out.println("After removing consecutive duplicates: " + removeDuplicates(input));
    }
}
