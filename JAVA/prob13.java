/* Write a program that defines an array of 10 int ranging from 1 - 100. prompt the user to enter 10 int and store in an array. search the array for the highest and lowest 
scores
and print both of these values together with it index.
*/
import java.util.*;
public class prob13{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 10 random numbers from 1 to 100");
		int arr[] = new int[10];
		for (int i=0;i<10 ;i++ ) {
			arr[i] = in.nextInt();
		}
		int	min = arr[0], max = arr[0],minIndex=0,maxIndex=0;
		for (int i=0;i<10 ;i++ ) {
			for (int j=i+1;j<10 ;j++ ) {
				if (arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
				if (arr[j]>max) {
					max = arr[j];
					maxIndex = j;
				}
			}
		}
		System.out.println("Max: "+max+" at Index "+maxIndex);
		System.out.println("Min: "+min+" at Index "+minIndex);
	}
}
