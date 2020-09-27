/*Write a program to enter the numbers till the user wants and at the end it should display the count of positive. negative and zeros entered
*/
import java.util.*;
public class prob21{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many times do you want to enter?");
		int size = in.nextInt();
		System.out.println("Enter the "+size+" numbers");
		int pos=0,neg=0,zero=0;
		int arr[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
			if (arr[i]<0) {
				neg++;
			}else if(arr[i]>0){
				pos++;
			}else{
				zero++;
			}
		}
		System.out.println("Positive Numbers: "+pos);
		System.out.println("Negative Numbers: "+neg);
		System.out.println("Zeros: "+zero);
	}
}
