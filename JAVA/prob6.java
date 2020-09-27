/* write a program in java to define a class student with following specifications Private members of class student registration number(int), sname(string), eng,maths,sci(float)
total(float), ctotal() - to calculate total marks. public members of class student are
Takedata() to accept values of data elements and invoke ctotal() function to calculate total marks
Showdata() to calculate all the data members on the screen
*/

import java.util.*;
class Student{
	private int regno;
	private float eng,maths,sci,total;
	private String sname;

	Student(String x,int y,float z,float a,float b){
		sname = x;
		regno = y;
		eng = z;
		maths = a;
		sci = b;
		ctotal(eng,maths,sci);
	}
	void ctotal(float x,float y,float z){
		total = x+y+z;
	}

	void takeData(float x, float y, float z){
		eng = x;
		maths = y;
		sci = z;
		ctotal(eng,maths,sci);
	}

	void showData(){
		System.out.println("Student name : "+sname);
		System.out.println("Student Registration Number : "+sname);
		System.out.println("Marks in English : "+eng);
		System.out.println("Marks in Maths : "+maths);
		System.out.println("Marks in Science : "+sci);
		System.out.println("Total : "+total);
	}

}
public class prob6{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Student Name");
		String sname = in.nextLine();
		System.out.println("Enter the Student Registration Number");
		int regno = in.nextInt();
		System.out.println("Enter the Marks in English");
		float eng = in.nextFloat();
		System.out.println("Enter the Marks in Maths");
		float maths = in.nextFloat();
		System.out.println("Enter the Marks in Science");
		float sci = in.nextFloat();
		Student s = new Student(sname,regno,eng,maths,sci);
		boolean check = true;
		while(check){
			System.out.println("1.update the marks of the student");
			System.out.println("2.Display the information of the student");
			System.out.println("---any other number to exit---");
			int ch = in.nextInt();
			switch(ch){
				case 1:	System.out.println("Enter the New marks of English");
						float neng = in.nextFloat();
						System.out.println("Enter the New marks of Maths");
						float nmaths = in.nextFloat();
						System.out.println("Enter the New marks of Science");
						float nsci = in.nextFloat();
						s.takeData(neng,nmaths,nsci);
						System.out.println("Records Updated succesfully");
						break;
				case 2: s.showData();
						break;
				default:check = false;
						break;
			}
		}
	}
}
