class Bank{
	private int acno;
	private char typeofac;
	private double balance;

	Bank(){/* to assign default values*/
		acno = 100;
		typeofac = 'S';
		balance = 5000.00;
	}

	Bank(int acno,char typeofac,double balance){/* to assign user values*/
		this.acno = acno;
		this.typeofac = typeofac;
		this.balance = balance;
	}

	void deposit(double amount){
		balance+=amount;
	}

	void withdraw(double amount){
		if (amount<balance) {
			balance-=amount;
			System.out.println(amount+" has been withdrawn");
		}else{
			System.out.println("Insufficient balance");
		}
	}

	void display(){
		System.out.println("Account Number = "+acno);
		System.out.println("Balance = "+balance);
	}

}
public class Assign4a{
	public static void main(String[] args) {
		Bank b1 = new Bank(101,'C',500.0);/* User values*/
		Bank b2 = new Bank();/* Default values*/
		Bank b3 = new Bank(102,'F',600.0);
		b1.deposit(100.0);
		b2.withdraw(1000.0);
		b3.display();
	}
}