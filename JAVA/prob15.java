/* if the total selling price of 15 items and the total profit earned on them is input through the keyboard, write a program to find the cost price of one item.
*/
import java.util.*;
public class prob15{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Selling Price of 15 items");
		int sp = in.nextInt();
		System.out.println("Enter the Total profit ");
		int tp = in.nextInt();
		System.out.println("The cost price of one item is "+(sp-tp)/15);
	}
}
