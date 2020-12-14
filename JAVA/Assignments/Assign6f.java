/* Assignment 1 (3)*/
class MyDate{
	int day,month,year;

	MyDate(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	int daysBetween(MyDate date){
		int res=0;
		if (greaterEqual(date)) {
			res = day-date.day; 
		}else{
			res = -1;
		}
		return res;
	}

	boolean greaterEqual(MyDate date){
		if (day>=date.day) {
			return true;
		}else{
			return false;
		}
	}

	MyDate add(int days){
		MyDate temp = new MyDate(0,0,0);
		temp.day = (day+days)%32;
		temp.month = month;
		temp.year = year;
		return temp;
	}
}
public class Assign6f{
	public static void main(String[] args) {
		MyDate d1 = new MyDate(18,7,1999);
		MyDate d2 = new MyDate(7,9,1999);
		int no_of_days = d1.daysBetween(d2);
		System.out.println(no_of_days);
		d2 = d1.add(no_of_days);
		System.out.println(d2.day);
	}
}