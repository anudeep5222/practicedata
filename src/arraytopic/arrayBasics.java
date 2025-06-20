
package arraytopic;

public class arrayBasics {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= new int[5];
		int arr3[]=new int[] {5,10,15};
		System.out.println("for loop");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		System.out.println("enhanced for loop");
		for(int num: arr3) {
			System.out.println(num);
		}
		System.out.println("\n while loop");
		int i=0;
		while(i<arr1.length) {
			System.out.println(arr1[i]);
			i++;
		}

		// TODO Auto-generated method stub



	}

}
