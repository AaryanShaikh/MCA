/* Write a program that converts all lowercase characters in a given string to its equivalent uppercase character. 
*/
import java.util.*;
public class prob27{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string");
		String str = in.nextLine().toUpperCase();
		System.out.println("The string with its equivalent uppercase characters "+str);
	}
}
