/* write a program in java to define a class batsman in cricket team, include the following members - firstname, lastname, runs made, number of fours, number of sixes, and 
the following member functions
1) to assign initial value
2) to update runs made
3) to display batsman's information
*/

import java.util.*;
class Batsman{
	String fname,lname;
	int runs,fours,sixes;
	
	Batsman(String a, String b, int x, int y,int z){
		fname = a;
		lname = b;
		runs = x;
		fours = y;
		sixes = z;
	}

	void updateRuns(int x){
		runs = x;
	}

	void display(){
		System.out.println("Firstname :"+fname);
		System.out.println("Lastname :"+lname);
		System.out.println("Number of Runs :"+runs);
		System.out.println("Number of Fours :"+fours);
		System.out.println("Number of Sixes :"+sixes);
	}

}
public class prob5{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the First name");
		String fname = in.nextLine();
		System.out.println("Enter the Last name");
		String lname = in.nextLine();
		System.out.println("Enter the Runs made");
		int runs = in.nextInt();
		System.out.println("Enter the Number of fours");
		int fours = in.nextInt();
		System.out.println("Enter the Number of sixes");
		int six = in.nextInt();
		Batsman bt = new Batsman(fname,lname,runs,fours,six);
		boolean check = true;
		while(check){
			System.out.println("1.Update runs");
			System.out.println("2.display batsman info");
			System.out.println("---any other number to exit--");
			int ch = in.nextInt();
			switch(ch){
				case 1: System.out.println("Enter the new Runs for the batsman");
						int num = in.nextInt();
						bt.updateRuns(num);
						break;
				case 2: bt.display();
						break;  
				default: check = false;
						break;
			}
		}
	}
}
