/*Write a progam to fill the entire screen with diamond and heart alternatively. The ASCII value for heart is 3 and that of diamond is 4.
*/
import java.util.*;
public class prob22{
	public static void main(String[] args) {
		int a = 3, b = 4;
		char heart = (char)a, diamond = (char)b;
		for (int i=2;i>1 ;i++ ) {
			if (i%2==0) {
				System.out.print(heart);
			}else{
				System.out.print(diamond);
			}
		}
	}
}
