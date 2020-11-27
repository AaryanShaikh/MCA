import java.util.*;
public class SstfDSA{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of disks");
		int size = in.nextInt();
		int disk[] = new int[size+3];
		System.out.println("Enter the "+size+" sizes");
		for (int i=0;i<size ;i++ ) {
			disk[i] = in.nextInt();
		}
		System.out.println("Enter the head of the track");
		disk[size] = in.nextInt();
		System.out.println("Enter the tail of the track");
		disk[size+1] = in.nextInt();
		disk[size+2] = 0;
		int disp[] = disk.clone();
		int df[] = new int[disp.length];
		Arrays.fill(df,0);
		Arrays.sort(disp);
		for (int i=0;i<disp.length ;i++ ) {
			System.out.print(disp[i]+"\t");
		}
		System.out.println();
		int mini = 0, prev = disk[size],min=9999999,count=1;
		for (int i=0;i<disp.length ;i++ ) {
			if (prev!=disp[i]) {
				System.out.print("\t");
			}else{
				df[i] = 1;
				System.out.print(count);
				count++;
			}
		}
		System.out.println();
		int k=0,total=0;
		while(k<size){
			for (int i=0;i<disp.length ;i++ ) {
				if (df[i]!=0||disk[size+2]==disp[i]||disk[size+1]==disp[i]) {
					continue;
				}
				if (Math.abs(prev-disp[i])<min) {
					min = Math.abs(prev-disp[i]);
					mini = i;
				}
			}
			for (int i=0;i<disp.length ;i++ ) {
				if (mini!=i) {
					System.out.print("\t");
				}else{
					df[i]=1;
					System.out.print(count);
					count++;
				}
			}
			total = total+Math.abs(prev-disp[mini]);
			prev = disp[mini];
			k++;
			min=9999999;
			System.out.println();
		}
		System.out.println("Total seek time = "+total);
	}
}