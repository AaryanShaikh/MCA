/* The X and Y coordinates of 10 different points are entered through the keyboard. Write a program to find the distance of last point from the first point (sum of distance
between consecutive points). 
*/
import java.util.*;
public class prob26{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x[] = new int[10];
		int y[] = new int[10];
		for (int i=0;i<10 ;i++ ) {
			System.out.println("Enter the Values of x"+(i+1));
			x[i] = in.nextInt();
			System.out.println("Enter the Values of y"+(i+1));
			y[i] = in.nextInt(); 
		}
		double sum = 0.0;
		for (int i=0;i<9 ;i++ ) {
			sum+=Math.sqrt(Math.pow(x[i+1]-x[i], 2)+Math.pow(y[i+1]-y[i], 2));
		}
		System.out.println("The distance between the points is "+sum);
	}
}
