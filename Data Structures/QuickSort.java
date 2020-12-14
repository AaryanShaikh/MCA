import java.util.*;
public class QuickSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[in.nextInt()];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = in.nextInt();
		}
		QuickSort qs = new QuickSort();
		qs.qSort(arr,0,arr.length-1);
		qs.printArr(arr);
	}
	int partition(int arr[], int low, int high){
		int pivot = arr[(low+high)/2];
		while(low<=high){
			while(arr[low]<pivot){
				low++;
			}
			while(arr[high]>pivot){
				high--;
			}
			if (low<=high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;high--;
			}
		}
		return low;
	}
	
	void qSort(int arr[],int low,int high){
		int pivot = partition(arr,low,high);
		if (low<pivot-1) {
			qSort(arr,low,pivot-1);
		}
		if (pivot<high) {
			qSort(arr,pivot,high);
		}
	}

	void printArr(int arr[]){
		for (int x:arr ) {
			System.out.print(x+" ");
		}
	}
}