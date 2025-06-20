package arraytopic;

import java.util.Arrays;

public class commonArrayOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {12,5,27,8,16,3};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int key=27;
		int index=Arrays.binarySearch(num, key);
		System.out.println(index+"is the index of element key");
		int copy1[]=Arrays.copyOfRange(num,2,5);
		System.out.println("range copy"+ Arrays.toString(copy1));
		int filledArray[]=new int[5];
		Arrays.fill(filledArray,42);
		System.out.println("filled array" + Arrays.toString(filledArray));
		System.out.println("arrays equal?"+ Arrays.equals(num, copy1));
		

	}

}
