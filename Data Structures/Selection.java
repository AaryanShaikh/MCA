import java.util.*;
public class Selection{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		int arr[]  = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
		}
		int min;
		int count=1;
		for (int i=0;i<size-1 ;i++ ) {
			min = i;
			int j;
			for (j=i+1;j<size ;j++ ) {
				if (arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp; 
			System.out.print("Count "+ count++ +": ");
			for (int k=0;k<size ;k++ ) {
				System.out.print(arr[k]+" ");
			}
				System.out.println();
		}
	}
}