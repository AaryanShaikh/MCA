import java.util.*;
public class CscanDSA{
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
		int count=1,index = 0;
		for (int i=0;i<disp.length ; i++) {
			if(disk[size]!=disp[i]){
				System.out.print("\t");
			}else{
				index = i;
				System.out.print(count);
				count++;
				break;
			}
		}
		System.out.println();
		int i=index+1;
		while(true){
			if (i<disp.length) {
				for (int j=0;j<i ;j++ ) {
					System.out.print("\t");
				}
				System.out.println(count);
				count++;
				i++;
			}else{
				break;
			}
		}
		i=0;
		while(true){
			if (i<index) {
				for (int j=0;j<i ;j++ ) {
					System.out.print("\t");
				}
				System.out.println(count);
				count++;
				i++;
			}else{
				break;
			}
		}
		
	}
}