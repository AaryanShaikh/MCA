/* Define a class employee in java with the following specification: Private members - empno(int), ename(string), basic,hra,da(float), netpay(float), calc()-> to calculate 
basic + hra + da with float return type 
methods - haveData()-> function to accept values for empno, sname, basic, hra, da and invoke calc() to calculate netpay, dispdata()-> function to display all the data members 
on the screen.
*/

import java.util.*;
class Employee{
	Scanner in = new Scanner(System.in);
	private int empno;
	private String ename;
	private float basic,hra,da,netpay;

	float calculate(float basic, float hra, float da){
		return basic+hra+da;
	}

	void havedata(){
		System.out.println("Enter the Employee name");
		ename = in.nextLine();
		System.out.println("Enter the Employee number");
		empno = in.nextInt();
		System.out.println("Enter the basic");
		basic = in.nextFloat();
		System.out.println("Enter the hra");
		hra = in.nextFloat();
		System.out.println("Enter the da");
		da = in.nextFloat();
		netpay = calculate(basic,hra,da);
	}

	void dispdata(){
		System.out.println("Employee name: "+ename);
		System.out.println("Employee number: "+empno);
		System.out.println("Employee netpay: "+netpay);
	}
}
public class prob8{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.havedata();
		e.dispdata();		
	}
}
