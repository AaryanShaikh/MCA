/* Write a program to output whether the person should be insured or not, his/her premium rate and maximum amount for which he/she can be insured.
*/
import java.util.*;
public class prob17{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Person's Health (Excellent,Poor)");
		String health = in.nextLine().toLowerCase();
		System.out.println("Enter where the Person lives (City,Village)");
		String lives = in.nextLine().toLowerCase();
		System.out.println("Enter the Person's Gender (Male,Female)");
		String gender = in.nextLine().toLowerCase();
		System.out.println("Enter the Person's age ");
		int age = in.nextInt();
		if ((health.equals("excellent"))&&(age>=25&&age<=35)&&(lives.equals("city"))&&(gender.equals("male"))) {
			System.out.println("The premium is Rs. 4 per thousand and his policy amount cannot exceed Rs. 2 lakhs.");/* Because i don't know the formula to calculate premium 😂😂😂*/
		}
		else if ((health.equals("excellent"))&&(age>=25&&age<=35)&&(lives.equals("city"))&&(gender.equals("female"))) {
			System.out.println("The premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh.");
		}
		else if ((health.equals("poor"))&&(age>=25&&age<=35)&&(lives.equals("village"))&&(gender.equals("male"))) {
			System.out.println("The premium is Rs. 6 per thousand and his policy amount cannot exceed Rs. 10,000.");
		}
		else{
			System.out.println("The person is not insured.");
		}
	}
}
