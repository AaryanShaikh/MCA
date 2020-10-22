import java.util.*;
class Date{
	int day,month,year;
	
	Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

}
public class Assign1b{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Day,Month and Year of First Object");/*Space seperated*/
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int day = Integer.parseInt(strsplit[0]);
		int month = Integer.parseInt(strsplit[1]);
		int year = Integer.parseInt(strsplit[2]);
		Date d1 = new Date(day,month,year);
		System.out.println("Enter the Day,Month and Year of second Object");/*Space seperated*/
		String str2 = in.nextLine();
		String strsplit2[] = str2.split(" ");
		day = Integer.parseInt(strsplit2[0]);
		month = Integer.parseInt(strsplit2[1]);
		year = Integer.parseInt(strsplit2[2]);
		Date d2 = new Date(day,month,year);
		System.out.println("After Subtracting...\nThe new 'VALID' Date is ");
		int newDay,newMonth,newYear;
		newMonth = (Math.abs(d1.month-d2.month))%13;/* month cannot be 13*/
		newYear = Math.abs(d1.year-d2.year); 
		if ((newMonth==2)) {/* cuz feb only has 28 - 29 days*/
			newDay = (Math.abs(d1.day-d2.day))%30;
		}else{
			newDay = (Math.abs(d1.day-d2.day))%32;
		}
			if (newDay==0) {/* Day cannot be 0*/
				newDay++;
			}
			if(newMonth==0){/* Month cannot be 0*/
				newMonth++;
			}
			if (newYear<1000) {/* for my algo valid year is 1000 and more*/
				int yrsToMakeValid = 1000-newYear;
				newYear+=yrsToMakeValid;/* if its not then make it 1000*/
			}
			System.out.println(newDay+" - "+newMonth+" - "+newYear);
	}
}