/* Assignment 1 (6)*/
class Number{
	String num;
	Number(){
		num=Integer.toString(1);
	}
	void setNum(int num){
		this.num = Integer.toString(num);
	}
	void setNum(double num){
		this.num = Double.toString(num);
	}
	int getNum(){
		return Integer.parseInt(num);
	}
	int checkNum(){
		int res = 0;
		if (num.contains(".")) {
			res = 2;
		}else if (Integer.parseInt(num) < 0) {
			res = 1;
		}else{
			res = 0;
		}
		return res;
	}
	public boolean isPrime(){
		int n=Integer.parseInt(num),flag=0,rem;
		for(int i=2;i<n;i++){
			rem=n%i;
			if(rem==0){
				flag=1;
			}
		}
		if(flag==0){
			return (true);
		}
		else{
			return (false);
		}
	}
}
public class Assign6i{
	public static void main(String[] args) {
		Number n = new Number();
		System.out.println(n.getNum());
		n.setNum(0);
		System.out.println(n.checkNum());
		n.setNum(2.5);
		System.out.println(n.checkNum());
		n.setNum(-6);
		System.out.println(n.checkNum());
		n.setNum(17);
		System.out.println(n.isPrime());
	}
}