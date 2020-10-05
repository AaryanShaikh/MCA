import java.util.*;
public class WorstFit{
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
		Arrays.sort(mem);
		for (int i=size-1;i>=0 ;i-- ) {
			for (int j=0;j<size2 ;j++ ) {
				if (pro[j]<mem[i]&&pf[j]==0&&mf[i]==0) {
					System.out.println(pro[j]+" is put in "+mem[i]);
					pf[j]=1;
					mf[i]=1;		
				}		
			}
		}
		for (int i=0;i<size2 ;i++ ) {
			if (pf[i]==0) {
				System.out.println(pro[i]+" must wait");
			}
		}
	}
}