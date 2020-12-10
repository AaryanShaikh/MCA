class Bank{
	private double balance;
	
	public Bank(double balance){/* constructor to assign balance*/
		this.balance = balance;
	}

	void todo(int x,double amount){/* User's choice (1->withdraw 2->deposit)*/
		if (x==1) {
			if (amount<=balance){
				processing(amount,1);
				System.out.println(amount+" has been withdrawn");
			}else{
				System.out.println("Insufficient balance");
			}
		}else{
			processing(amount,2);
			System.out.println(amount+" has been deposited");
		}
	}

	private void processing(double amount,int x){/* The Processing the bank does is private and cannot be accessed*/
		if (x==1) {
			balance-=amount;
		}else{
			balance+=amount;
		}
	}

	 protected void showBalance(){/* only that particular person can access his/her balance*/
		System.out.println("Balance is "+balance);
	}

}
class Person extends Bank{
	String name;
	Person(String name,double amount){
		super(amount);
		this.name = name;
	}
} 
public class Assign5a{
	public static void main(String[] args) {
		Person p1 = new Person("Aaryan",10000.0);
		p1.todo(1,1500);
		System.out.println("The name of the person is "+p1.name);
		p1.showBalance();
		Person p2 = new Person("Bhawesh",5000.0);
		p2.todo(2,1000);
		System.out.println("The name of the person is "+p2.name);
		p2.showBalance();
	}
}