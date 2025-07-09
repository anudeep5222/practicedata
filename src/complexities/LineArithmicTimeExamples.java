package complexities;
import java.util.*;
public class LineArithmicTimeExamples {

	// Merge Sort implementation
	public static void mergeSort(int[] arr) {
	if (arr.length > 1) {
	int mid = arr.length / 2;
	int[] left = Arrays.copyOfRange(arr, 0, mid);
	int[] right = Arrays.copyOfRange(arr, mid, arr.length);
	mergeSort(left); // T(n/2)
	mergeSort(right); // T(n/2)
	merge(arr, left, right); // O(n)
	}
	}
	private static void merge(int[] arr, int[] left, int[] right) {
	int i = 0, j = 0, k = 0;
	while (i < left.length && j < right.length) {
	if (left[i] <= right[j]) arr[k++] = left[i++];
	else arr[k++] = right[j++];
	}
	while (i < left.length) arr[k++] = left[i++];
	while (j < right.length) arr[k++] = right[j++];
	}
	// Heap Sort implementation
	public static void heapSort(int[] arr) {
	// Build heap
	for (int i = arr.length / 2 - 1; i >= 0; i--)
	heapify(arr, arr.length, i);
	// Extract elements
	for (int i = arr.length - 1; i > 0; i--) {
	int temp = arr[0];
	arr[0] = arr[i];
	arr[i] = temp;
	heapify(arr, i, 0);
	}
	}
	private static void heapify(int[] arr, int n, int i) {
	// Heap implementation
	}
	public static void main(String[] args) {
	int[] arr = {12, 11, 13, 5, 6, 7};

	mergeSort(arr);
	System.out.println("Merge sorted: " + Arrays.toString(arr));
	int[] arr2 = {4, 10, 3, 5, 1};
	heapSort(arr2);
	System.out.println("Heap sorted: " + Arrays.toString(arr2));
	}
	}
