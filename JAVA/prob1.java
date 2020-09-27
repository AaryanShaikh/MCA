/* Write a class in JAVA having two private variables and one member function which will return the area of the rectangle */

class Rectangle{
	private int length;
	private int breadth;
	Rectangle(int x, int y){
		length = x;
		breadth = y;
	}
	
	int area(){
		return length*breadth;
	}
}
public class prob1{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(30,20);
		System.out.println("Area of Rectangle is "+rec.area());
	}
}
