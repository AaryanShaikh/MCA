import java.util.*;
public class sjf{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of process");
		int size = in.nextInt();
		int p[] = new int[size];/*process id*/
		int at[] = new int[size];/*Arrival Time*/
		int bt[] = new int[size];/*Burst Time*/
		int f[] = new int[size];/*Finished (boolean)*/
		int ct[] = new int[size];/*completion time*/
		int tat[] = new int[size];/*TurnAround time*/
		int wt[] = new int[size];/*Waiting time*/

		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the Arrival Time of P"+i);
			at[i] = in.nextInt();
			System.out.println("Enter the Burst Time of P"+i);
			bt[i] = in.nextInt();
			p[i] = i+1;
			f[i] = 0;
		}
		
		int st = 0;/*start time*/
		int tot = 0;/*total completed*/
		
		while(true){
			int c=size;/*current process*/
			int min = 99999;/*to make sure i.e 1st process is min*/

			if (tot==size) {
				break;
			}

			for (int i=0;i<size ;i++ ) {
				/*1. if arrival time is <= start time (to make sure that the process is available)
				  2. if the proccess is not finshed excuting
				  3. if the curr process burst time is < min*/
				if ((at[i]<=st) && (f[i]==0) && (bt[i]<min)) {/* taking the min bt process*/
					min = bt[i];
					c=i;
				}
			}
			if (c==size) {/*if no process arrived at that point/time*/
				st++;
			}
			else{
				ct[c] = st+bt[c];/*compute the completion time*/
				st=st+bt[c];/*increase the starting time to compute the next completion time*/
				tat[c] = ct[c]-at[c];/*compute the turn around time*/
				wt[c] = tat[c]-bt[c];/*compute the waiting time*/
				f[c] = 1;/*1-> finished 0->unfinished*/
				p[tot] = c+1;/* id of the current process*/
				tot++; /* increasing the total completed process*/
			}
		}
		float avgtat = 0.0f;
		float avgwt = 0.0f; 
		System.out.println("\npid arrival burst completion turn waiting");
		for (int i=0;i<size ;i++ ) {
			avgtat = avgtat+tat[i];
			avgwt = avgwt+wt[i];
			System.out.println(p[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);		
		}
		System.out.println("Average Tat: "+avgtat/size);
		System.out.println("Average Wt: "+avgwt/size);
		System.out.println("Gantt Chart");
		for (int i=0;i<size ;i++ ) {
				System.out.print(" P"+p[i]+" ");
			}	
	}
}