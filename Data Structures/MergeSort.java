import java.util.*;
public class MergeSort{
	
	int arr[];
	int temp[];
	int length;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		System.out.println("Enter the elements of the array");
		int inarr[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			inarr[i] = in.nextInt();
		}
		MergeSort ms = new MergeSort(); /*so that i can use the methods of this class*/
		ms.sort(inarr);
		System.out.println("Sorted Array");
		for (int i:inarr ) {
			System.out.print(i+" ");
		}
	}
	
	public void sort(int inarr[]){
		this.arr = inarr;
		this.length = inarr.length;
		this.temp = new int[length];
		divideArr(0,length-1);
	}

	public void divideArr(int li,int hi){
		if (li<hi) {
			int mid = li+(hi-li)/2;
			divideArr(li,mid);/*it will sort the lhs of the array*/
			divideArr(mid+1,hi);/*it will sort the rhs of the array*/
			mergeArr(li,mid,hi);
		}
	}

	public void mergeArr(int li,int mid,int hi){
		for (int i=li;i<=hi ;i++ ) {
			temp[i]=arr[i];
		}
		int i=li, j=mid+1, k=li;
		while(i<=mid&&j<=hi){
			if (temp[i]<=temp[j]) {
				arr[k++] = temp[i++];
			}
			else{
				arr[k++] = temp[j++];
			}
		}
		/*if any sub array is left*/
		if (i<=mid) {
			while(i<=mid){
			arr[k++]=temp[i++];
		}
			while(j<=hi){
				arr[k++]=temp[j++];	
			}
		}
	}
}