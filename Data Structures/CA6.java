import java.util.*;
public class CA6{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int arr1[] = new int[in.nextInt()];
		System.out.println("Enter the "+arr1.length+" values ");
		for (int i=0;i<arr1.length ;i++ ) {
			arr1[i] = in.nextInt();
		}
		System.out.println("Enter the size of the second array");
		int arr2[] = new int[in.nextInt()];
		System.out.println("Enter the "+arr2.length+" values ");
		for (int i=0;i<arr2.length ;i++ ) {
			arr2[i] = in.nextInt();
		}
		int sum1=0,sum2=0,temp=0,check=0;
		for (int i=0;i<arr1.length ;i++ ) {
			for (int j=0;j<arr2.length ;j++ ) {
				temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				for (int x=0;x<arr1.length ;x++ ) {
					sum1+=arr1[x];
				}
				for (int x=0;x<arr2.length ;x++ ) {
					sum2+=arr2[x];
				}
				if (sum1==sum2) {
					System.out.println("("+arr1[i]+","+arr2[j]+")");
					check=1;
				}
				temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				if (check==1) {
					break;
				}
				temp = sum1 = sum2 = 0;
			}
			if (check==1) {
				break;
			}
		}
	}
}