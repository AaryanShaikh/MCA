import java.util.*;
public class CA7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arr[] = new int[in.nextInt()];
		System.out.println("Enter the "+arr.length+" values");
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the sum you wanna find");
		int sum = in.nextInt();
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=0;j<arr.length ;j++ ) {
				if (i==j) {
					continue;
				}else{
					if (arr[i]+arr[j]==sum) {
						System.out.print("("+arr[i]+", "+arr[j]+") ");
					}
				}
			}
		}
	}
}