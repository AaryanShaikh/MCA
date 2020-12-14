/* Assignment 1-1 (3)*/
import java.util.Scanner;
class Date{
	int day,month,year;
	
	void setDate(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
}
class People extends Date{
	Scanner in = new Scanner(System.in);
	String name,email,address;
	Date date = new Date();
	void putDate(){
		System.out.println("Enter the Day");
		int day = in.nextInt();
		System.out.println("Enter the Month");
		int month = in.nextInt();
		System.out.println("Enter the Year");
		int year = in.nextInt();
		date.setDate(day,month,year);
	}
	void putData(String name,String email,String address){
		this.name = name;
		this.email = email;
		this.address = address;
	}
	void getData(){
		System.out.println(name+"\t\t"+date.day+"/"+date.month+"/"+date.year+"\t"+email+"\t\t"+address);
	}
}
public class Assign6c{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Assign6c a6 = new Assign6c();
		System.out.println("Enter the no of people");
		People p[] = new People[in.nextInt()];
		in.nextLine();
		for (int i=0;i<p.length ; ) {
		 	p[i] = new People();
		 	System.out.println("Enter the Name of person "+(i+1));
		 	String name = in.nextLine();
		 	System.out.println("Enter the Date of birth of person "+(i+1));
		 	p[i].putDate();
		 	System.out.println("Enter the email of person "+(i+1));
		 	String email = in.nextLine();
		 	System.out.println("Enter the address of person "+(i+1));
		 	String address = in.nextLine();
		 	p[i].putData(name,email,address);
		 	i++;
		 	if (i==p.length) {
		 		System.out.println("\nThis is the final Data:");
		 		System.out.println("Name\t\tDate of birth\t\tEmail\t\tAddress");
		 		for (int j=0;j<p.length ;j++ ) {
		 			p[j].getData();
		 		}
		 		System.out.println("\nEnter the 1 to check if two emails are equal or not");
		 		System.out.println("Enter the 2 to check if two Date of births are equal or not");
		 		System.out.println("Enter the 3 to check if two address are equal or not");
		 		System.out.println("Enter the 4 to check if two names are equal or not");
		 		System.out.println("Enter your choice");
		 		int ch = in.nextInt();
		 		if (ch==1||ch==3||ch==4) {
		 			System.out.println("You can choose any two persons from 1 - "+p.length);/* Example (1 2), (5 3), (8 9) make sure there's space in between*/
		 			int temp[] = new int[2];
		 			for (int x=0;x<2 ;x++ ) {
		 				temp[x] = in.nextInt();
		 			}
		 			a6.equals(p[temp[0]-1].email,p[temp[1]-1].email);
		 		}else if (ch==2) {
		 			System.out.println("You can choose any two persons from 1 - "+p.length);
		 			int temp[] = new int[2];
		 			for (int x=0;x<2 ;x++ ) {
		 				temp[x] = in.nextInt();
		 			}
		 			a6.equals(p[temp[0]-1].date,p[temp[0]-1].date);
		 		}
		 	}
		 } 
	}
	void equals(Date date1,Date date2){
		if (date1.day==date2.day&&date1.month==date2.month&&date1.year==date2.year) {
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}
	void equals(String str1,String str2){
		boolean trigger = true;
		for (int i=0;i<str1.length()&&i<str2.length() ;i++ ) {
			if (str1.charAt(i)!=str2.charAt(i)) {
				trigger = false;
			}
		}
		if (trigger) {
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}
}