/* Define a class in java named Donor with the following specifs: Private members: Donor no(int), name(string), blood grp(string). Private methods: input()-> to accept all the 
info, output()-> display all info, checkgrp()-> to return the blood grp
*/

import java.util.*;
class Donor{
	Scanner in = new Scanner(System.in);
	private int dno;
	private String name,bloodgrp;

	void input(){
		System.out.println("Enter the name of the donor");
		name = in.nextLine();
		System.out.println("Enter the name of the blood group");
		bloodgrp = in.nextLine();
		System.out.println("Enter the dno of the donor");
		dno = in.nextInt();
		bloodgrp = checkgrp(bloodgrp);
	}

	void output(){
		System.out.println("Donor no: "+dno);
		System.out.println("Donor name: "+name);
		System.out.println("Donor blood group: "+bloodgrp);
	}

	String checkgrp(String bloodgrp){
		return bloodgrp;
	}
}
public class prob10{
	public static void main(String[] args) {
		Donor d =new Donor();
		d.input();
		d.output();
	}
}
