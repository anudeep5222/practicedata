package arraytopic;

import java.util.Arrays;

public class selectionSort {
	public static void ss(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2[]= {64,23,213,5,23,4,2};
		ss(arr2);
		System.out.println("After selecton sort"+ Arrays.toString(arr2));
		ss

	}

}
