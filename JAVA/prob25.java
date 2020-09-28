/* Write programs for the following: 1. To find arithmetic mean of two numbers. 2. To find absolute value of a number. 3.To convert a uppercase alphabet to lowercase. 4. To 
obtain the bigger of two numbers. 
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
		System.out.println("The Arithmetic Mean is "+res/size);
		System.out.println("Absolute value is "+Math.abs(res/size));
		String str = "IAmCypher";
		System.out.println(str.toLowerCase());
		System.out.println("The highest of the two numbers is "+Math.max(56, 55));
	}
}
