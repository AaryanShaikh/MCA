import java.util.*;
class Toh{
	int steps = 1; 
	void towerOfHanoi(int n,char start,char spare,char dest){
		if (n==1) {
			System.out.println("Step:"+ steps++ +":Move "+n+" disk from " +start+ " to "+dest);// direct start->dest
		}
		else{
			towerOfHanoi(n-1,start,dest,spare);//first to spare
			System.out.println("Step:"+ steps++ +":Move "+n+" disk from " +start+ " to "+dest);
			towerOfHanoi(n-1,spare,start,dest);//second from spare to dest
		}
	}
}
public class TowerOfHanoi{  	
	public static void main(String args[]) 
	{ 
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number of Disks");
		int n = in.nextInt();
		Toh t = new Toh(); 
		System.out.println("Assign a Character to your Source");
		char a = in.next().charAt(0);
		System.out.println("Assign a Character to your Temporary");
		char b = in.next().charAt(0);
		System.out.println("Assign a Character to your Destination");
		char c = in.next().charAt(0);
		t.towerOfHanoi(n, a, b, c); 
	} 
} 