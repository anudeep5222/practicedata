package arraytopic;

public class binarysearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int l=0;
		int r=arr.length-1;
		int search=3;
		boolean found=false;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid]==search) {
				found=true;
				System.out.println("number found at index "+mid);
				break;
			}
			if(arr[mid]>search) {
				r=mid-1;
			}
			if(arr[mid]<search) {
				l=mid+1;
			}
					
			
		}
		// TODO Auto-generated method stub
		if(!found) {
			System.out.println("number not found");
		}
		

	}

}
