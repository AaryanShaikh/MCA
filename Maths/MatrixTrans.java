import java.util.*;
public class MatrixTrans{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
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
		System.out.println("After Transposing");
		for (int i=0;i<col1 ;i++ ) {
			for (int j=0;j<row1 ;j++ ) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}