import java.util.*;
class Stack{
	int sarr[] = new int[5];//stack array
	int top = 0;
	public void push(int x){//enter element
		if (top<5) {
			System.out.println("\nThe Pushed element is "+x);
			sarr[top] = x;
			top++;
		}
		else{
			System.out.println("Overflow!!");
		}
	}

	public void display(){//display entire stack
		System.out.print("Stack:");
		for (int i=0;i<top ;i++ ) {
			System.out.print(sarr[i]+" ");
		}
	}

	public void peek(){//show last element
		if (top>0) {
			System.out.println("\nThe last stack value is "+sarr[top-1]);
		}
		else{
			System.out.println("the Stack is empty!");
		}
	}

	public void pop(){
		if (top>0) {
			top--;
			System.out.println("\nthe popped value is "+sarr[top]);
			sarr[top] = 0;
		}
		else{
			System.out.println("Underflow!!!");
		}
	}
}
public class StackAssign{
	public static void main(String[] args) {
		Stack s = new Stack();// new s object
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while(check){
			System.out.println("\n1.push an element");
			System.out.println("2.pop an element");
			System.out.println("3.peek on the last element");
			System.out.println("4.Display stack");
			System.out.println("--Any other number to exit--");
			System.out.println("Enter Your Choice");
			int ch = in.nextInt();
			switch (ch) {
				case 1: 
					System.out.println("Enter the value you want to push");
					int x = in.nextInt();
					s.push(x);
					break;
				case 2: 
					s.pop();
					break;
				case 3: 
					s.peek();
					break;
				case 4: 
					s.display();
					break;
				default: check = false; 
				break;
			}
		}
	}
}