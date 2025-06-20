package collections;


import java.util.ArrayList;
import java.util.Iterator;

public class removeEvens {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(20);
        numbers.add(33);
        numbers.add(42);
        numbers.add(55);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("List after removing evens: " + numbers);
    }
}
