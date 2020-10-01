import java.util.*;
public class BinarySearch{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = in.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the element to search");
		int ele = in.nextInt();
		int low = 0;
		int high = size-1;
		int mid = 0;
		for (int i=0;i<size ;i++ ) {
			mid = (low + high)/2;
			if (arr[mid]==ele) {
				System.out.println("Element found!");
				System.exit(1);
			}
			else{
				if (ele>arr[mid]) {
					low = mid+1;
				}else{
					high = mid-1;
				}
			}
		}
		System.out.println("Element not found");
	}
}
