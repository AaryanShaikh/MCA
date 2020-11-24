import java.util.*;
public class FcfsDSA{
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
		Arrays.sort(disp);
		for (int i=0;i<disp.length ;i++ ) {
			System.out.print(disp[i]+"\t");
		}
		System.out.println();
		int count = 0, num = 1, total = 0,prev = 0;
		boolean check = true; 
		for (int j=0;j<size ;j++ ) {
			count = 0;
			if (check) {
				for (int i=0;i<disp.length ;i++ ) {
					if (disk[size]==disp[i]) {
						prev = disk[size];
						int k=0;
						while(k<count){
							System.out.print("\t");
							k++;
						}
						System.out.print(num);
						num++;
						break;
					}else{
						count++;
					}
				}
				j--;
				check = false;
			}else{
				for (int i=0;i<disp.length ;i++ ) {
					if(disk[j]==disp[i]){
						total+=Math.abs(prev-disk[j]);
						prev = disk[j];
						int k=0;
						while(k<count){
							System.out.print("\t");
							k++;
						}
						System.out.print(num);
						num++;
						break;
					}else{
						count++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("Total head movement of "+total+" tracks");
	}
}
