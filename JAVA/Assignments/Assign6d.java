/* Assignment 1 (1)*/
import java.util.Scanner;
public class Assign6d{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Assign6d a6 = new Assign6d();
		System.out.println("Enter 1 for multiplication of 2 integers");
		System.out.println("Enter 2 for multiplication of 2 float");
		System.out.println("Enter 3 for multiplication of 2 matrixes");
		System.out.println("Enter your choice");
		int ch = in.nextInt();
		if (ch==1) {
			System.out.println("Enter the first Integer");
			int num1 = in.nextInt();
			System.out.println("Enter the second Integer");
			int num2 = in.nextInt();
			a6.multiply(num1,num2);
		}else if (ch==2) {
			System.out.println("Enter the first Float");
			float num1 = in.nextFloat();
			System.out.println("Enter the second Float");
			float num2 = in.nextFloat();
			a6.multiply(num1,num2);
		}else{
			System.out.println("Enter the number of Rows of first matrix");
			int row1 = in.nextInt();
			System.out.println("Enter the number of Columns of first matrix");
			int col1 = in.nextInt();
			System.out.println("Enter the elements of the First "+row1+"x"+col1+" matrix");
			int a[][] = new int[row1][col1];
			for (int i=0;i<row1 ;i++ ) {
				for (int j=0;j<col1 ;j++ ) {
					a[i][j] = in.nextInt();
				}
			}
			System.out.println("Enter the number of Rows of Second matrix");
			int row2 = in.nextInt();
			System.out.println("Enter the number of Columns of Second matrix");
			int col2 = in.nextInt();
			System.out.println("Enter the elements of the Second "+row2+"x"+col2+" matrix");
			int b[][] = new int[row2][col2];
			for (int i=0;i<row2 ;i++ ) {
				for (int j=0;j<col2 ;j++ ) {
					b[i][j] = in.nextInt();
				}
			}
			if (col1!=row2) {
				System.out.println("The no of columns in first matrix is not equal to no of rows in the second matrix");
			}else{
				a6.multiply(a,b,col1,row1,col2,row2);
			}
		}
	}
	void multiply(int num1,int num2){
		System.out.println("The product of 2 integers is "+(num1*num2));
	}
	void multiply(float num1,float num2){
		System.out.println("The product of 2 floats is "+(num1*num2));
	}
	void multiply(int a[][],int b[][], int col1,int row1,int col2,int row2){
		int c[][] = new int[col1][row2];
		for (int i=0;i<row1 ;i++ ) {
			for (int j=0;j<col2 ;j++ ) {
				for (int k=0;k<row2 ;k++ ) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("After Multiplication");
		for (int i=0;i<row1 ;i++ ) {
			for (int j=0;j<col2 ;j++ ) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}