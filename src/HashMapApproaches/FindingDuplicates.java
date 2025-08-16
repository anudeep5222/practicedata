package HashMapApproaches;


	
import java.util.*;

public class FindingDuplicates {
	public static List<Integer> findDuplicates(int[] nums) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		List<Integer> duplicates = new ArrayList<>();
		for (int num : nums) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
			if (freq.get(num) == 2) {
				duplicates.add(num);
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2, 1, 4 };
		System.out.println(findDuplicates(nums)); 
	}
}