/* Write programs for the following: 1. To find arithmetic mean of two numbers. 2. To find absolute value of a number.
*/
import java.util.*;
public class prob25{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = in.nextInt();
		System.out.println("Enter the "+size+" numbers");
		int res=0,num=0;
		for (int i=0;i<size ;i++ ) {
			num = in.nextInt();
			res+=num;
		}
		System.out.println("The Arithmetic Mean is + Absolute value is "+Math.abs(res/size));
	}
}
