/* A library charges a fine for every book returned late. For first days the fine is 50 paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you 
return the book after 30 days your membership will be cancelled. Write a program to accept the number of days the member is late to return the book and display the fine or 
the appropriate message
*/
import java.util.*;
public class prob18{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of days the member is late");
		int late = in.nextInt();
		if (late<=5) {
			System.out.println("fine is 50 paise");
		}else if(late>5&&late<=10){
			System.out.println("fine is 1 rupee");
		}else if (late>10&&late<30) {
			System.out.println("fine is 5 rupee");
		}else if(late>=30){
			System.out.println("Membership is cancelled");
		}
	}
}
