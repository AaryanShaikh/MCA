/* Write a function to obtain the prime factors of this number. For example, prime factors of 24 are 2, 2, 2 and 3, whereas prime factors of 35 arc 5 and 7.
*/
import java.util.*;
public class prob23{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to find its prime factors");
		int num = in.nextInt();
		int res=0;
		for (int i=2;i<num ;i++ ) {
			for (int k=2;k<num ;k++ ) {
				res = i*k;
				if (res==num) {
					System.out.print(i+" ");
					if (k%2==0) {
						num = k;
						res = 0;
						i = 2;
						k = 2;
					}
					else{
						System.out.print(k+" ");
						System.exit(1);
					}
				}
			}
		}
	}
}
