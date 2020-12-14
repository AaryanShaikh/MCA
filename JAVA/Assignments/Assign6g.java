/* Assignment 1 (4)*/
import java.util.*;
public class Assign6g{
	static int c[][] = new int[3][3];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Assign6g a6 = new Assign6g();
		System.out.println("Enter the values for 3x3 matrix A");
		int a[][] = new int[3][3];
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				a[i][j] = in.nextInt();
			}
		}
		System.out.println("Enter the values for 3x3 matrix B");
		int b[][] = new int[3][3];
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				b[i][j] = in.nextInt();
			}
		}
		a6.addition(a,b);
		System.out.println("After addition");
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				System.out.print(c[i][j]+" ");				
			}
			System.out.println();			
		}
		a6.sortMatrix(c);
		System.out.println("After sorting");
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				System.out.print(c[i][j]+" ");				
			}
			System.out.println();			
		}
		a6.transpose(c);
	}
	void sortMatrix(int c[][]){
		for (int i=0;i<3 ;i++ ) {
			int arr[] = new int[3];
			for (int j=0;j<3 ;j++ ) {
				arr[j] = c[i][j];
			}
			Arrays.sort(arr);
			for (int j=0;j<3;j++) {
				c[i][j] = arr[j];	
			}
		}
	}
	void transpose(int c[][]){
		System.out.println("Transpose of the matrix");
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				System.out.print(c[j][i]+" ");				
			}
			System.out.println();			
		}
	}
	void addition(int a[][],int b[][]){
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
	}
}