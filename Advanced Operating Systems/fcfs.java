import java.util.*;
public class fcfs{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of proccess");
		int size = in.nextInt();
		System.out.println("Enter the Arrival time");
		int at[] = new int[size];
		int bt[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			at[i] = in.nextInt();
		}
		System.out.println("Enter the Burst time");
		for (int i=0;i<size ;i++ ) {
			bt[i] = in.nextInt();
		}
		int c[] = new int[size];
		c[0] = bt[0];
		for (int i=1;i<=size-1 ;i++ ) {
			c[i] = bt[i]+c[i-1];
		}
		int tat[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			tat[i] = c[i]-at[i];
		}
		int wt[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			wt[i] = tat[i]-bt[i];
		}
		System.out.println("Pid\tAT\tBT\tCT\tTAT\tWT");
		for (int i=0;i<size ;i++ ) {
			System.out.println("P"+i+"\t"+at[i]+"\t"+bt[i]+"\t"+c[i]+"\t"+tat[i]+"\t"+wt[i]);
		}
		float avgtat=0.0f,avgwt=0.0f;
		for (int i=0;i<size ;i++ ) {
			avgtat+=tat[i];
			avgwt+=wt[i];
		}
		System.out.println("Average Tat is "+avgtat/size);
		System.out.println("Average Wt is "+avgwt/size);
	}
}
