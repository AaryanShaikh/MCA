/* Assignment 1-1 (2)*/
import java.util.*;
class Student{
	int usn,total=0;
	String name;
	int marks[] = new int[3];

	void setData(int usn,String name,int marks[]){
		this.usn = usn;
		this.name = name;
		for (int i=0;i<3 ;i++ ) {
			this.marks[i] = marks[i];
			total+=marks[i];
		}
	}

	void getData(){
		System.out.println(usn+"\t"+name+"\t"+marks[0]+"\t"+marks[1]+"\t"+marks[2]+"\t"+total);
	}
}
public class Assign6b{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student s[] = new Student[10];
		for (int i=0;i<s.length ; ) {
			s[i] = new Student();
			System.out.println("Enter the USN of student no "+(i+1));
			int usn = in.nextInt();
			in.nextLine();
			System.out.println("Enter the name of student no "+(i+1));
			String name = in.nextLine();
			int marks[] = new int[3];
			for (int j=0;j<3 ;j++ ) {
				System.out.println("Enter the marks of "+(j+1)+" subject");
				marks[j] = in.nextInt();			
			}
			s[i].setData(usn,name,marks);
			i++;
			if (i==3) {
				System.out.println("USN\tName\tDS\tJava\tOS\tTotal");
				int avg = 0;
				for (int j=0;j<3 ;j++ ) {
					s[j].getData();
					avg+=s[j].total;	
				}
				System.out.println("The avarage marks of all the students are "+(avg/s.length));			
			}		
		}
	}
}