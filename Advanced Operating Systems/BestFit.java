import java.util.*;
public class BestFit{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of memory partitions");
		int size = in.nextInt();
		System.out.println("Enter the sizes of the "+size+" memory partitions");
		int mem[] = new int[size];
		int mf[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			mem[i] = in.nextInt();
			mf[i] = 0;
		}
		System.out.println("Enter the number of processes");
		int size2 = in.nextInt();
		System.out.println("Enter the sizes of the "+size2+" processes");
		int pro[] = new int[size2];
		int pf[] = new int[size2];
		for (int i=0;i<size2 ;i++ ) {
			pro[i] = in.nextInt();
			pf[i] = 0;
		}
		int diff = 0;
		int mindiff = 0;
		int minindex = 0;
		int k;
		int count;
		for (int i=0;i<size2 ;i++ ) {/*process*/
				k=0;
				count = 0;
				diff = 0;
				while(k<size){/*memory partitions*/
					if (mf[k]==0&&pf[i]==0) {
						if (pro[i]<mem[k]) {
							diff = mem[k]-pro[i];
							if (count==0) {
								mindiff = diff;
								minindex = k;
								count = 1;
							}
							if (diff<mindiff) {
								mindiff = diff;
								minindex = k;
							}
						}
					}
						k++;
				}
						pf[i] = 1;
						mf[minindex] = 1;
						System.out.println(pro[i]+" is put in "+mem[minindex]+" partition");
						minindex = 0;
						mindiff = 0;
			}
	}
}