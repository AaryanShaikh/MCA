/* Assignment 1-1 (1)*/
import java.util.Scanner;
public class Assign6a{
	public static void main(String[] args) {
		Assign6 a6 = new Assign6();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 of the following");
		System.out.println("1 for Integer Array");
		System.out.println("2 for Float Array");
		System.out.println("3 for Sentence");
		System.out.println("Your Choice?");
		int ch = in.nextInt();
		if (ch==1) {
			System.out.println("Enter the size of the array");
			int arr[] = new int[in.nextInt()];
			System.out.println("Enter the "+arr.length+" elements");
			for (int i=0;i<arr.length ;i++ ) {
				arr[i] = in.nextInt();
			}
			System.out.println("Enter the index you wanna change");
			int index = in.nextInt();
			a6.replace(arr,index);
			for (int i=0;i<arr.length ;i++ ) {
				System.out.print(arr[i]+" ");
			}
		}else if (ch==2) {
			System.out.println("Enter the size of the array");
			double arr[] = new double[in.nextInt()];
			System.out.println("Enter the "+arr.length+" elements");
			for (int i=0;i<arr.length ;i++ ) {
				arr[i] = in.nextDouble();
			}
			System.out.println("Enter the index you wanna change");
			int index = in.nextInt();
			a6.replace(arr,index);
			for (int i=0;i<arr.length ;i++ ) {
				System.out.print(arr[i]+" ");
			}
		}else if (ch==3) {
			in.nextLine();
			System.out.println("Enter the String");
			String str = in.nextLine();
			System.out.println("Enter the index you wanna change");
			int index = in.nextInt();
			a6.replace(str,index);
		}else{
			System.out.println("Wrong input");
		}
	}

	void replace(int arr[],int index){
		int max = Integer.MIN_VALUE;
		for (int i=0;i<arr.length ;i++ ) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		for (int i=0;i<arr.length ;i++ ) {
			if (i==index) {
				arr[i] = max;
				break;
			}
		}
	}

	void replace(double arr[],int index){
		double max = Double.MIN_VALUE;
		for (int i=0;i<arr.length ;i++ ) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		for (int i=0;i<arr.length ;i++ ) {
			if (i==index) {
				arr[i] = max;
				break;
			}
		}	
	}

	void replace(String str, int index){
		String strsplit[] = str.split(" ");
		for (int i=0;i<str.length() ;i++ ) {
			if (i==index) {
				StringBuffer sb = new StringBuffer(str);
				sb.setCharAt(index,(char)(strsplit.length+'0'));
				System.out.println(sb);
				break;
			}
		}
	}
}