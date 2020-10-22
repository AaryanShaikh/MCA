import java.util.*;
public class IdentifyMatrix{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Rows of first matrix");
		int row = in.nextInt();
		System.out.println("Enter the number of Columns of first matrix");
		int col = in.nextInt();
		if (row==0&col==0) {
			System.out.println("Rows and columns cannot be 0");
			return;
		}
		System.out.println("Enter the elements of the First "+row+"x"+col+" matrix");
		int a[][] = new int[row][col];
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				a[i][j] = in.nextInt();
			}
		}
		int zero=0,diag=0,diag2=0,k=a[0][0],scal=0,one=0,lower=0,lower2=0,upper=0,upper2=0;
		boolean flag = true,flag2 = true;
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				if (a[i][j]==0) {
					zero++;
				}		
				if ((i!=j&&a[i][j]==0)||(i==j&&a[i][j]==k)) {
					if (i==j) {
						scal++;
					}
				}
				if ((i!=j&&a[i][j]==0)||(i==j&&a[i][j]==1)) {
					if (i==j) {
						one++;
					}
				}
				if ((i!=j&&a[i][j]==0)||(i==j&&a[i][j]!=0)) {
					if (i==j) {
						if (i<row-1&&j<col-1) {
							if (a[i][j+1]!=0) {
								flag2 = false;
							}
						}
						diag++;
					}else if(a[i][j]==0){
						diag2++;
					}
				}
				if (j>i&&a[i][j]==0||(j<=i&&a[i][j]!=0)) {
					if (j>i) {
						lower++;
					}else if(a[i][j]!=0){
						lower2++;
					}
				}
				if (j<i&&a[i][j]==0||(j>=i&&a[i][j]!=0)) {
					if (j<i) {
						upper++;
					}else if(a[i][j]!=0){
						upper2++;
					}
				}
				if (upper2>lower2) {
					flag = false;
				}
			}
		}
		if (zero==(row*col)) {
			System.out.println("The matrix is a zero or null matrix");
		}else if(row>1&&col==1){
			System.out.println("The matrix is a column matrix");
		}else if(one==col){
			System.out.println("The matrix is an Identity matrix");
		}else if(scal==col){
			System.out.println("The matrix is a Scalar matrix");
		}else if(Math.abs(lower-lower2)==col&&flag){
			System.out.println("The matrix is a lower Triangular matrix");
		}else if(Math.abs(upper-upper2)==col){
			System.out.println("The matrix is a Upper Triangular matrix");
		}else if(Math.abs(diag-diag2)==col&&flag2){
			System.out.println("The matrix is a Diagonal matrix ");
		}else if(row==1&&col>1){
			System.out.println("The matrix is a row matrix");
		}else if(row==col){
			System.out.println("The matrix is a square matrix");
		}
	}
}