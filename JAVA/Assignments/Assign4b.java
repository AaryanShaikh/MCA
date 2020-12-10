class Employee{
	private int employee_no;
	private double basic;
	private double da;
	private double income_tax;
	private double net_sal;
	private double gross_sal;

	Employee(int employee_no,double basic){
		this.employee_no = employee_no;
		this.basic = basic;
		da = 52/basic * 100;/* 52% of basic*/
		gross_sal = da + basic;
		income_tax = 30/gross_sal * 100;/* 30% of gross salary*/
		net_sal = gross_sal - income_tax;
	}

	void display(){/* prints each employee details*/
		System.out.println("Employee No = "+employee_no);
		System.out.println("Basic = "+basic);
		System.out.println("Da = "+da);
		System.out.println("Gross Salary = "+gross_sal);
		System.out.println("Income Tax = "+income_tax);
		System.out.println("Net Salary = "+net_sal);
	} 
}
public class Assign4b{
	public static void main(String[] args) {
		Employee e1 = new Employee(1,100.0);
		Employee e2 = new Employee(2,200.0);
		Employee e3 = new Employee(3,300.0);
		e1.display();
		e2.display();
		e3.display();
	}
}