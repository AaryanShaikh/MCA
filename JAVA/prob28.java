/*Create a structure to specify data of customers in a bank. The data to be stored is: Account number. Name. Balance in account. Assume maxinuun of 200 customers in the bank. 
(a) Write a function to print the Account number and name of each customer with balance below Rs. 100. 
(b) If a cu.stomer request for withdrawal or deposit. it is given in the form: Acct. no. amount. code (1 for deposit. 0 for withdrawal) 
write a program to give a message. "The balance is insufficient for the specified withdrawal". 
*/
import java.util.*;
public class prob28{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of People in the Bank");
		int size = in.nextInt();
		in.nextLine();
		String cust[][] = new String[size][3];/*Accno,name,balance->3*/
		for (int i=0;i<size ;i++ ) {
			System.out.println("Enter the Account number, name and balance of the "+(i+1)+" customer");
			for (int j=0;j<3 ;j++ ) {
				cust[i][j] = in.nextLine();
			}
		}
		System.out.println("1.No of Customers whose balance is below 100");
		System.out.println("2.Withdrawal/Deposit");
		int ch = in.nextInt();
		switch(ch){
			case 1: balBelow(cust); 
				break;
			case 2:  
				withDepo(cust[0][0],100,0);/*I'm Sending the first Customer's Account number*/
				break;
			default : System.out.println("Wrong input!"); 
				break;
		}
	}
	static void withDepo(String accno,int amount,int code){
		System.out.println("The balance is insufficient for the specified withdrawal");
	}
	static void balBelow(String cust[][]){
		for (int i=0;i<cust.length ;i++ ) {
			if (Integer.parseInt(cust[i][2])<100) {
				int j=0;
				System.out.println("Account no->Name->Balance");
				while(j<3){
					System.out.print("->"+cust[i][j]);
					j++;
				}
				System.out.println();/*just making it neat*/
			}
		}
	}
}
