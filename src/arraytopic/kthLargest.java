package arraytopic;

import java.util.Arrays;

public class kthLargest {
	public static int kLargest(int arr[],int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,322,11,11,77,77};
		int kth=kLargest(arr,3);
		System.out.println(kth);

	}

}
