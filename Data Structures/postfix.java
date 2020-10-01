import java.util.*;
class Stack{
	String sarr[] = new String[5];
	int top = 0;

	public void push(String x){
		sarr[top] = x;
		top++;
	}

	public void show(){
		System.out.print("Stack:");
		for (int i=0;i<top ;i++ ) {
			System.out.print(sarr[i]+" ");
		}
	}

	public String pop(){
			if (top==0) {
				System.out.println("Stack empty");
			}
			else{
				top--;
			}
			return sarr[top];
	}
}
public class postfix{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack s =new Stack();
		String x,y,z,val;
		int a,b,res;
		System.out.println("Enter the Expression");
		String expr = in.nextLine();
		for (int i=0;i<expr.length();i++) {
			if (Character.isDigit(expr.charAt(i))) {
				val = String.valueOf(expr.charAt(i));
				s.push(val);
			}
			else{
				switch(expr.charAt(i)){
					case '+':
						x=s.pop();
						y=s.pop();
						a=Integer.parseInt(x);
						b=Integer.parseInt(y);
						res = b+a;
						z=Integer.toString(res); 
						s.push(z);
						break;
					case '-':
						x=s.pop();
						y=s.pop();
						a=Integer.parseInt(x);
						b=Integer.parseInt(y);
						res = b-a;
						z=Integer.toString(res);
						s.push(z);
						break;
					case '*':
						x=s.pop();
						y=s.pop();
						a=Integer.parseInt(x);
						b=Integer.parseInt(y);
						res = b*a;
						z=Integer.toString(res);
						s.push(z);
						break;
					case '/':
						x=s.pop();
						y=s.pop();
						a=Integer.parseInt(x);
						b=Integer.parseInt(y);
						res = b/a;
						z=Integer.toString(res); 
						s.push(z);
						break;
				}
			}
		}
		s.show();
	}
}