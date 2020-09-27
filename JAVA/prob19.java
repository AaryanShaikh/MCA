/*  If the three sides of a triangle are entered through the keyboard, write a program to check whether the triangle is valid or not. The triangle is valid if the sum of 
two sides is greater than the largest of the three sides.
*/
import java.util.*;
public class prob19{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i=1;i<=3 ;i++ ) {
			System.out.println("Enter the "+i+" side ");
			arr[i-1] = in.nextInt();
		}
		Arrays.sort(arr);
		if ((arr[2]+arr[1])>arr[2]) {
			System.out.println("Triangle is valid");
		}else{
			System.out.println("Triangle is not valid");
		}
	}
}
