/*For bucket sort
use float values
example
Enter your choice
7
Enter the number of elements
10
Enter the 10 elements
0.78 0.17 0.39 0.26 0.72 0.94 0.21 0.12 0.23 0.68
Sorted
0.12
0.17
0.21
0.23
0.26
0.39
0.68
0.72
0.78
0.94
For Radix Sort
example
Enter your choice
8
Enter the number of elements
4
Enter the elements!
100
111
101
001
Step 1: 100 101 001 111
Step 2: 100 001 101 111
Step 3: 001 100 101 111
Step 4: 001 100 101 111
*/
import java.util.*;
public class Sorting{
	int arr2[];
	int temp[];
	int length;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1. To sort the array using Bubble Sort");
		System.out.println("2. To sort the array using Selection Sort");
		System.out.println("3. To sort the array using Insertion Sort");
		System.out.println("4. To sort the array using Merge Sort");
		System.out.println("5. To sort the array using Quick Sort");
		System.out.println("6. To sort the array using Heap Sort");
		System.out.println("7. To sort the array using Bucket Sort");
		System.out.println("8. To sort the array using Radix Sort");
		System.out.println("Enter your choice");
		int ch = in.nextInt();
		if (ch==7) {
			System.out.println("Enter the number of elements");
			int size = in.nextInt();
			float arr[] = new float[size];
			System.out.println("Enter the "+size+" elements");
			float b0[] = new float[size];
			float b1[] = new float[size];
			float b2[] = new float[size];
			float b3[] = new float[size];
			float b4[] = new float[size];
			float b5[] = new float[size];
			float b6[] = new float[size];
			float b7[] = new float[size];
			float b8[] = new float[size];
			float b9[] = new float[size];
			int in0=0,in1=0,in2=0,in3=0,in4=0,in5=0,in6=0,in7=0,in8=0,in9=0;
			for (int i=0;i<size ;i++ ) {
				arr[i] = in.nextFloat();
				int res = (int)arr[i]*10;
				switch(res){
					case 0: b0[in0] = arr[i];
							in0++;
							break;
					case 1: b1[in1] = arr[i];
							in1++;
							break;
					case 2: b2[in2] = arr[i];
							in2++;
							break;
					case 3: b3[in3] = arr[i];
							in3++;
							break;
					case 4: b4[in4] = arr[i];
							in4++;
							break;
					case 5: b5[in5] = arr[i];
							in5++;
							break;
					case 6: b6[in6] = arr[i];
							in6++;
							break;
					case 7: b7[in7] = arr[i];
							in7++;
							break;
					case 8: b8[in8] = arr[i];
							in8++;
							break;
					case 9: b9[in9] = arr[i];
							in9++;
							break;
				}
			}
			Arrays.sort(b0);
			Arrays.sort(b1);
			Arrays.sort(b2);
			Arrays.sort(b3);
			Arrays.sort(b4);
			Arrays.sort(b5);
			Arrays.sort(b6);
			Arrays.sort(b7);
			Arrays.sort(b8);
			Arrays.sort(b9);
			int i=0;
			System.out.println("Sorted");
				if (in0>0) {
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b0[k]);
					}
				}else if(in1>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b1[k]);
					}
				}else if(in2>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b2[k]);
					}
				}else if(in3>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b3[k]);
					}
				}else if(in4>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b4[k]);
					}
				}else if(in5>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b5[k]);
					}
				}else if(in6>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b6[k]);
					}
				}else if(in7>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b7[k]);
					}
				}else if(in8>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b8[k]);
					}
				}else if(in9>0){
					for (int k=0;k<in0 ;k++ ) {
						System.out.println(b9[k]);
					}
				}
			System.exit(1);
		}else if(ch==8){
			System.out.println("Enter the number of elements");
			int size = in.nextInt();
			in.nextLine();
			System.out.println("Enter the elements!");
			String arr[] = new String[size];
			for (int i=0;i<size ;i++ ) {
				 arr[i] = in.nextLine();
			}
			String temp;
			int steps=1;
			for (int i=0;i<size ;i++ ) {
				for (int j=0;j<size-1 ;j++ ) {
					int k=1;
					while(arr[i].length()-k>=0){
						if (arr[j].charAt(arr[j].length()-k) > arr[j+1].charAt(arr[j].length()-k)) {
							temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;	
						}
						k++;		
					}
				}
				System.out.print("Step "+(steps++)+": ");
			for (int x=0;x<size ;x++ ) {
				System.out.print(arr[x]+" ");
			}
			System.out.println();
			}
		}else{
			System.out.println("Enter the size of the array");
			int arr[] = new int[in.nextInt()];
			System.out.println("Enter the "+arr.length+" elements");
			for (int i=0;i<arr.length ;i++ ) {
				arr[i] = in.nextInt();
			}
			int count=1;
			Sorting s = new Sorting();
		switch(ch){
			case 1: 
				
				for (int i=0;i<arr.length-1 ;i++ ) {
					for (int j=i+1;j<arr.length ;j++ ) {
						if (arr[i]>arr[j]) {
							int temp = arr[i];
							arr[i]  = arr[j];
							arr[j] = temp;
						}
					}
					System.out.print("Count "+ count++ +": ");
					for (int k=0;k<arr.length ;k++ ) {
						System.out.print(arr[k]+" ");
					}
					System.out.println();
				}
			break;
			case 2:
				int min;
				for (int i=0;i<arr.length-1 ;i++ ) {
					min = i;
					int j;
					for (j=i+1;j<arr.length ;j++ ) {
						if (arr[min]>arr[j]) {
							min = j;
						}
					}
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp; 
					System.out.print("Count "+ count++ +": ");
					for (int k=0;k<arr.length ;k++ ) {
						System.out.print(arr[k]+" ");
					}
						System.out.println();
				}
			break;
			case 3:
				int temp;
				for (int i=1;i<arr.length ;i++ ) {
					int j=i-1;
					temp=arr[i];
					while(j>=0&&arr[j]>temp){
						arr[j+1] = arr[j];
						j--;
					}
					arr[j+1]=temp;
					System.out.print("Step "+i+":");
					for (int k=0;k<arr.length ;k++ ) {
					System.out.print(" "+arr[k]);
					}
					System.out.println();
				}
			break;
			case 4:
				
				s.sort(arr);
				System.out.println("Sorted Array");
				for (int i:arr ) {
					System.out.print(i+" ");
				}
			break;
			case 5:
				s.qSort(arr,0,arr.length-1);
				s.printArr(arr);
			break;
			case 6:
				s.sort2(arr);
				for (int i=0;i<arr.length;i++ ) {
					System.out.print(arr[i]+" ");
				}
			break;
			default : System.out.println("Wrong Input");
			break;
		}
	}
}
	void sort2(int arr[]){
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

	public void sort(int inarr[]){
		this.arr2 = inarr;
		this.length = inarr.length;
		this.temp = new int[length];
		divideArr(0,length-1);
	}

	public void divideArr(int li,int hi){
		if (li<hi) {
			int mid = li+(hi-li)/2;
			divideArr(li,mid);
			divideArr(mid+1,hi);
			mergeArr(li,mid,hi);
		}
	}

	public void mergeArr(int li,int mid,int hi){
		for (int i=li;i<=hi ;i++ ) {
			temp[i]=arr2[i];
		}
		int i=li, j=mid+1, k=li;
		while(i<=mid&&j<=hi){
			if (temp[i]<=temp[j]) {
				arr2[k++] = temp[i++];
			}
			else{
				arr2[k++] = temp[j++];
			}
		}

		if (i<=mid) {
			while(i<=mid){
			arr2[k++]=temp[i++];
		}
			while(j<=hi){
				arr2[k++]=temp[j++];	
			}
		}
	}
}