package arraytopic;

public class removeduplicates {
	public static int removeDuplicates(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int uniqueIndex=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex]=arr[i];
			}
		}
		return uniqueIndex+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,3,4,5,4};
		System.out.println(removeDuplicates(arr));

	}

}
