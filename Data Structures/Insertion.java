import java.util.*;
public class Insertion{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		int arr[]  = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
		}
		int temp;
		for (int i=1;i<size ;i++ ) {
			int j=i-1;
			temp=arr[i];
			while(j>=0&&arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=temp;
			System.out.print("Step "+i+":");
			for (int k=0;k<size ;k++ ) {
			System.out.print(" "+arr[k]);
			}
			System.out.println();
		}
	}
}