import java.util.*;
public class HeapSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the "+arr.length+" elements");
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = in.nextInt();
		}
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		for (int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
	void sort(int arr[]){
		for (int i=arr.length/2-1;i>=0 ;i-- ) {
			heapify(arr,arr.length,i);
		}
		for (int i=arr.length-1;i>=0 ;i-- ) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr,i,0);
		}
	}
	void heapify(int arr[], int n, int i){
		int largest = i,li = 2*i+1, ri = 2*i+2;
		if (li<n && arr[li]>arr[largest]) {
			largest = li;
		}
		if (ri<n && arr[ri]>arr[largest]) {
			largest = ri;	
		}
		if (largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr,n,largest);
		}
	}
}