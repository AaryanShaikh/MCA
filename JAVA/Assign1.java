import java.util.*;/* for Comparator*/
import java.text.DecimalFormat;
class Student{
	DecimalFormat df = new DecimalFormat(".##");/* to print only 2 decimal points*/
	int rollno,maths,aos,java,eng,dbms;
	String name,degree,sem;
	final float total = 250;
	int got = 0;
	float percent = 0.0f;
	char grade;
	
	Student(int rollno,String name,String degree,String sem,int maths,int aos,int java,int eng,int dbms){
		this.rollno = rollno;
		this.name = name;
		this.degree = degree;
		this.sem = sem;
		this.maths = maths;
		this.aos = aos;
		this.java = java;
		this.eng = eng;
		this.dbms = dbms;
		got = maths+aos+java+eng+dbms;
		percent = calcPercent();
		grade  = calcGrade(percent);
	} 

	float calcPercent(){/* Calculating percentage */
		return (got/total)*100;
	}

	char calcGrade(float percent){/* Calculating Grade */
		if (percent>=90) {
			grade = 'S';
		}else if (percent>=80&&percent<=89){
			grade = 'A';
		}else if (percent>=70&&percent<=79){
			grade = 'B';
		}else if (percent>=60&&percent<=69){
			grade = 'C';
		}else if (percent>=50&&percent<=59){
			grade = 'D';
		}else if (percent>=40&&percent<=49){
			grade = 'E';
		}else if (percent>=30&&percent<=39){
			grade = 'P';
		}else{
			grade = 'F';
		}
		return grade;
	}
	float getPercent(){/* taking grade for comparision */
		return percent;
	}
	/* to sort the list according to percentage*/
	public static Comparator<Student> byPercent = new Comparator<Student>(){
		public int compare(Student s1, Student s2) {
		   float percent1 = s1.getPercent();
		   float percent2 = s2.getPercent();
		   if (percent1 > percent2) return -1;/* > will sort in desending order*/
		   if (percent1 < percent2) return 1;
		   return 0;
		}
	};

	@Override
	public String toString(){/* to print the list in the form of string*/
		return rollno+"\t"+name+"\t"+degree+"\t"+sem+"\t"+got+"\t"+df.format(percent)+"\t\t"+grade;
	}

}
public class Assign1{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(56,"Aaryan","MCA","1",10,20,30,40,50));
		list.add(new Student(55,"Bhawesh","MCA","1",10,15,20,25,30));
		list.add(new Student(25,"Arfu","MCA","1",50,50,50,50,50));
		System.out.println("Roll.No\tName\tDegree\tSem\tMarks\tPercentage\tGrade");
		Collections.sort(list, Student.byPercent);
		for (Student s : list) {
			System.out.println(s);
		}
	}
}