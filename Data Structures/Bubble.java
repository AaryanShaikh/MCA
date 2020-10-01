import java.util.*;
public class Bubble{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = in.nextInt();
		int arr[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
		}
		int count=1;
		for (int i=0;i<size-1 ;i++ ) {
			for (int j=i+1;j<size ;j++ ) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]  = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("Count "+ count++ +": ");
			for (int k=0;k<size ;k++ ) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}
}