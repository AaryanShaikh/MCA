/* if a five-digit number is input through the keyboard, write a program to print a new number by adding one to each of its digits. For example 12391->output = 23402 
*/
import java.util.*;
public class prob16{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 5-digit number");
		String str = in.nextLine();
		int arr[] = new int[str.length()];
		for (int i=0;i<str.length() ;i++ ) {
			arr[i] = Character.getNumericValue(str.charAt(i));
			arr[i] = (arr[i]+1)%10;
			System.out.print(arr[i]+"");	
		}	
	}
}
