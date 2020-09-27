/* . Write a function to compute the distance between two points and use it to develop another function that will compute the area of the triangle whose vertices are
A(x1. y 1), B(x2,y 2). and C(x3, y3). Use these functions to develop a function which returns a value 1 if the point (x, y) lines inside the triangle ABC, otherwise a value 0. 
input for dist -> 3 7 2 8
input for area -> 0 20 10 0 0 30
input for points in triangle -> 10 15
*/
import java.util.*;
import java.text.DecimalFormat;
public class prob24{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("To Calculate the distance between the two points");
		System.out.println("Enter the value of x1");
		int x1 = in.nextInt();
		System.out.println("Enter the value of x2");
		int x2 = in.nextInt();
		System.out.println("Enter the value of y1");
		int y1 = in.nextInt();
		System.out.println("Enter the value of y2");
		int y2 = in.nextInt();
		System.out.println("Distance between the two points is "+df.format(calcDist(x1,x2,y1,y2)));
		System.out.println("To Calculate the area pf the triangle whose vertices are given");
		System.out.println("Enter the value of x1");
		x1 = in.nextInt();
		System.out.println("Enter the value of x2");
		x2 = in.nextInt();
		System.out.println("Enter the value of x3");
		int x3 = in.nextInt();
		System.out.println("Enter the value of y1");
		y1 = in.nextInt();
		System.out.println("Enter the value of y2");
		y2 = in.nextInt();
		System.out.println("Enter the value of y3");
		int y3 = in.nextInt();
		System.out.println("Area of the triangle is "+df.format(calcArea(x1,x2,x3,y1,y2,y3)));
		System.out.println("Enter the value of x");
		int x = in.nextInt();
		System.out.println("Enter the value of y");
		int y = in.nextInt();
		System.out.println("Area of the triangle is "+pointsIn(x1,x2,x3,y1,y2,y3,x,y));
	}
	static double calcDist(int x1,int x2,int y1,int y2){
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	static double calcArea(int x1,int x2,int x3,int y1,int y2,int y3){
		return (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
	}
	static int pointsIn(int x1,int x2,int x3,int y1,int y2,int y3,int x,int y){
			double area = calcArea(x1,x2,x3,y1,y2,y3);
			double a = calcArea(x,x2,x3,y,y2,y3);
			double b = calcArea(x1,x,x3,y1,y,y3);
			double c = calcArea(x1,x2,x,y1,y2,y);
			if (area==a+b+c) {
				return 1;
			}else{
				return 0;
			}
	}
}
