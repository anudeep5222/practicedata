package classMethods;
public class LongestSubstring {
    public static int findLongestSubstring(String s) {
        boolean[] charExists = new boolean[256]; 
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charExists[s.charAt(right)]) { 
                charExists[s.charAt(left)] = false; 
                left++;
            }

            charExists[s.charAt(right)] = true; 
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcdeabcbb";
        System.out.println("Longest substring length: " + findLongestSubstring(str));
    }
}
