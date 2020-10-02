import java.util.*;
public class priority{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Processes");
		int size = in.nextInt();
		int p[] = new int[size];
		int bt[] = new int[size];
		int pri[] = new int[size];
		int f[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the Burst Time of P"+i);
			bt[i] = in.nextInt();
			System.out.println("Enter the Priority of P"+i);
			pri[i] = in.nextInt();
			p[i] = i;
			f[i] = 0;
		}
		int ct[] = new int[size];
		int tat[] = new int[size];
		int wt[] = new int[size];
		int st = 0;
		int tot = 0;

		while(true){
			int c=size;
			int min = 99999;

			if (tot==size) {
				break;
			}

			for (int i=0;i<size ;i++ ) {
				if (f[i]==0 && pri[i]<min) {
					min = pri[i];
					c=i;
				}
			}
			ct[c] = st+bt[c];
			tat[c] = ct[c];
			wt[c] = tat[c]-bt[c];
			f[c] = 1;
			tot++;
			st+=bt[c];
		}
		System.out.println("Pid\tB.T\tPrior\tC.T\tTAT\tW.T");
		for (int i=0;i<size ;i++ ) {
			System.out.println(i+"\t"+bt[i]+"\t"+pri[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
		}
		float avgtat = 0, avgwt = 0;
		for (int i=0;i<size ;i++ ) {
			avgtat+=tat[i];
			avgwt+=wt[i];
		}
		System.out.println("Average TAT is "+avgtat/size);
		System.out.println("Average WT is "+avgwt/size);
	}
}