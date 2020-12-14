/* Assignment 1 (5)*/
class Rectangle{
	int a,b;
	Rectangle(int a,int b){
		this.a = a;
		this.b = b;
	}
	void toRectangle(Polar p){
		System.out.println("After converting to Rectangular");
		System.out.println("a="+(p.r*Math.cos(p.theata)));
		System.out.println("b="+(p.r*Math.sin(p.theata)));
	}
}
class Polar{
	double r,theata;
	Polar(double r, double theata){
		this.r = r;
		this.theata = theata;
	}
	void toPolar(Rectangle r){
		System.out.println("After converting to Polar");
		System.out.println("r="+(Math.sqrt(Math.pow(r.a, 2)+Math.pow(r.b, 2))));
		System.out.println("Theata="+(Math.tan(r.b/r.a)));
	}
}
public class Assign6h{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		Polar p = new Polar(6.40,51.34);
		p.toPolar(r);
		r.toRectangle(p);
	}
}