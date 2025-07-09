package myCollections;
import java.util.*;
public class reverseArrayList {

    public static void reverseList(ArrayList<Character> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap characters at left and right positions
            char temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        charList.add('D');
        charList.add('E');

        System.out.println("Original List: " + charList);
        reverseList(charList);
        System.out.println("Reversed List: " + charList);
    }
}
