import java.util.*;
public class CA3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of floors");
		int floors = in.nextInt();
		int eggs = 2;
		if (floors==1||floors==0) {
			System.out.println("The number of drops for worst case is "+floors);
		}else{
			int low=1,high=floors,mid=(low+high)/2,lower=0,higher=0;
			for (int i=low;i<=mid-1 ;i++ ) {/*if egg breaks*/
				lower++;
			}
			for (int i=mid+1;i<=high ;i++ ) {/*if egg doesn't break*/
				higher++;
			}
			System.out.println("The number of drops for worst case is "+(1+Math.max(lower, higher)));
		}
	}
}