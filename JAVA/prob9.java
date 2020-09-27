/* Define a class Student in Java for the following specification: Private members of the Student are: rollno(int), name(string), class(string), marks(int[5]),percentage(float)
Public members: readmarks()-> reads mark and invoke the calc(), calc()-> calculates the percentage of marks, displaymarks()-> prints the data.
*/

import java.util.*;
class Student{
	Scanner in =new Scanner(System.in);
	private int rollno;
	private String name,class_st;
	private int marks[] = new int[5];
	private float percent;

	float calculate(int marks[]){
		float total = 0.0f;
		for (int i=0;i<5 ;i++ ) {
			total += marks[i];
		}
			return (total/250)*100;
	}

	void readmarks(){
		System.out.println("Enter the Student's name");
		name = in.nextLine();
		System.out.println("Enter the Student's class");
		class_st = in.nextLine();
		System.out.println("Enter the Student's roll no");
		rollno = in.nextInt();
		for (int i=0;i<5 ;i++ ) {
			System.out.println("Enter the marks of subject "+(i+1));
			marks[i] = in.nextInt();
		}
		percent = calculate(marks);
	}

	void displaymarks(){
		System.out.println("Student's name: "+name);
		System.out.println("Student's class: "+class_st);
		System.out.println("Student's roll no: "+rollno);
		System.out.println("Student's percent: "+percent);
	}
}
public class prob9{
	public static void main(String[] args) {
		Student s = new Student();
		s.readmarks();
		s.displaymarks();				
	}
}
