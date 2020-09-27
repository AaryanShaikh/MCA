/* write a program in java to perform addition operation on complex data using class and object. the program should ask for real and imaginary part of two complex numbers,
and dislay the real and imaginary parts of their sum. */

import java.util.*;
public class prob3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter real part of first number");
		int real1 = in.nextInt();
		System.out.println("Enter real part of second number");
		int real2 = in.nextInt();
		System.out.println("Enter imaginary part of first number");
		int img1 = in.nextInt();
		System.out.println("Enter imaginary part of second number");
		int img2 = in.nextInt();
		int res1 = real1+real2;
		int res2 = img1+img2;
		System.out.println("Complex number is "+res1+"+"+res2+"i");
	}
}
