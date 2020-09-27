/*Write a class in java called "student" with
Data Members:
name,marks1,marks2
The Program asks the user to enter the name and marks. then calc_media() calculates total marks on screen in different lines.*/

import java.util.*;
class Student{
	String name;
	int marks1,marks2,res;
		Student(String x){
			name = x;
		}

	void cal_media(int x, int y){
		marks1 = x;
		marks2 = y;
		res = marks1+marks2;
	}

	void display(){
		System.out.println("Name: "+name);
		System.out.println("Total: "+res);
	}
}
public class prob2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = in.nextLine();
		Student s = new Student(name);
		System.out.println("Enter the marks 1");
		int marks1 = in.nextInt(); 
		System.out.println("Enter the marks 2");
		int marks2 = in.nextInt();
		s.cal_media(marks1,marks2);
		s.display();
	}
}
