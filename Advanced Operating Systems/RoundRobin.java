import java.util.*;
public class RoundRobin{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Processes");
		int size = in.nextInt();
		System.out.println("Enter the Time Slice");
		int time = in.nextInt();
		int bt[] = new int[size];
		int temp[] = new int[size];
		int ct[] = new int[size];
		int f[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the Burst Time for P"+i);
			bt[i] = in.nextInt();
			temp[i] = bt[i];
			f[i] = 0;
		}
		int st=0;
		int tot=0;
		int flag = 0;
		int i=0;
		while(true){
			
			if (tot==size) {
				break;
			}

			if (i<size && f[i]==0) {
				flag = 0;

				for (int k=0;k<time ;k++ ) {
					st++;
					temp[i] = temp[i]-1;
					if (temp[i]==0) {
						ct[i] = st;
						flag=1;
						tot++;
						f[i]=1;
						break;
					}
				}
			}
			i=(i+1)%size;
		}
		int tat[] = new int[size];
		int wt[] = new int[size];
		float avgtat = 0.0f, avgwt = 0.0f;
		for (int k=0;k<size ;k++ ) {
			tat[k] = ct[k];
			wt[k] = tat[k]-bt[k];
			avgtat+=tat[k];
			avgwt+=wt[k];
		}
		System.out.println("Pid\tB.T\tC.T\tTAT\tW.T");
		for (int k=0;k<size ;k++ ) {
			System.out.println(k+"\t"+bt[k]+"\t"+ct[k]+"\t"+tat[k]+"\t"+wt[k]);
		}
		System.out.println("Average TAT "+avgtat/size);
		System.out.println("Average WT "+avgwt/size);
	}
}