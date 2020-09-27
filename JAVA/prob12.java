/* Define a class in java with following desc: Private members: Flight no(int),destination(string),distance(float),fuel(float),calfuel()-> to calculate the value of fuel as
per the foll criteria
distance                      fuel
<=1000                        500
more than 1000 and <= 2000    1100
more than 2000                2200
methods: feedinfo()-> to allow user to enter values for flight no,dest,distance & call func calfuel()-> to calc the quantity of fuel, showinfo()-> to allow user to view the 
content of all the data members
*/
import java.util.*;
class Flight{
	Scanner in =new Scanner(System.in);
	private int fno;
	private String destination;
	private float distance,fuel;

	float calfuel(float distance){
		if (distance<=1000.0f) {
			return 500.0f;
		}
		else if(distance>1000&&distance<=2000){
			return 1100.0f;
		}
		else{
			return 2200.0f;	
		}
	}

	void feedinfo(){
		System.out.println("enter the destination");
		destination = in.nextLine();
		System.out.println("enter the flight no");
		fno = in.nextInt();
		System.out.println("enter the distance");
		distance = in.nextFloat();
		fuel = calfuel(distance);
	}

	void dispinfo(){
		System.out.println("Flight no: "+fno);
		System.out.println("destination: "+destination);
		System.out.println("distance: "+distance);
		System.out.println("fuel: "+fuel);
	}
}
public class prob12{
	public static void main(String[] args) {
		Flight f =new Flight();
		f.feedinfo();
		f.dispinfo();
	}
}
