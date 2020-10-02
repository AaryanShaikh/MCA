import java.util.*;
public class RadixSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
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
	}
}