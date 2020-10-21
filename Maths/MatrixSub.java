import java.util.*;
public class MatrixSub{
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
		int c[][] = new int[row1][col1];
		if (row1==row2&&col1==col2) {
			for (int i=0;i<row1 ;i++ ) {
				for (int j=0;j<col1 ;j++ ) {
					c[i][j] = a[i][j]-b[i][j];		
				}		
			}
			System.out.println("After Addition");
			for (int i=0;i<row1 ;i++ ) {
				for (int j=0;j<col1 ;j++ ) {
					System.out.print(c[i][j]+" ");		
				}
				System.out.println();		
			}		
		}else{
			System.out.println("Rows and Colums of First and Second Matrix doesn't match Addition not Possible");	
		}	
	}
}