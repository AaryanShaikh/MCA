import java.util.*;
public class CA4{
	public static void main(String[] args) {
		int arr[] = new int[100];
		Arrays.fill(arr,0);
		for (int i=1;i<=100 ;i++ ) {
			for (int j=i;j<=100 ;j=j+i ) {
				if (arr[j-1]==0) {
					arr[j-1]=1;
				}else{
					arr[j-1]=0;
				}
			}
		}
		System.out.println("These are the rooms open");
		for (int i=0;i<100 ;i++ ) {
			if (arr[i]==1) {
				System.out.print((i+1)+" ");	
			}
		}
	}
}