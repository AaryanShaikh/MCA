import java.util.*;
class Stack{
	char sarr[] = new char[5];
	int top = 0;
	
	public void push(char x){
		sarr[top] = x;
		top++;
	}

	public char peek(){
		return sarr[top-1];
	}

	public char pop(){
		top--;
		return sarr[top];
	}

	public boolean isEmpty(){
		if (top == 0) {
			return true;
		}
		else{
			return false;
		}
	}

	public char priority(char x){
		if(x=='^'){ return 5;}
		else if(x=='/') { return 4;}
		else if(x=='*') { return 3;}
		else if(x=='+') { return 2;}
		else { return 1;}
	}
}
public class Infix2post{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the expression");
		String str = in.nextLine();// example = ((a+b)*c-d)*e
		char res[] = new char[50];
		Stack s = new Stack();
		int index = 0;
		for (int i=0;i<str.length() ;i++ ) {
			//if num or alpha add directly 2 result
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' 
				|| str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				res[index] = str.charAt(i);
				index++;
			}
			//if opening bracket add 2 stack
			else if(str.charAt(i)=='('){
				s.push(str.charAt(i));
					
			}
			//if closing bracket pop evrything till opening bracket
			else if(str.charAt(i)==')'){
				while(!s.isEmpty()){
					char x = s.pop();
					if(x!='('){
						res[index] = x;
						index++;
				} else{
					break;
				}
			}
		}
		//if operator 
			else if (str.charAt(i)=='^'||str.charAt(i)=='*'||str.charAt(i)=='-'||str.charAt(i)=='+'
				||str.charAt(i)=='/') {
				//is stack empty push 2 stack
				if (s.isEmpty()) {
					s.push(str.charAt(i));
					
				}
				else{
					while(!s.isEmpty()){
						char x = s.pop();//pop the top ele 2 check
						if (x=='(') {
							s.push(x);//if open push back 2 stack
							
							break;
						}
						else if(x=='*'||x=='+'||x=='-'||x=='/'||x=='^'){
							//if incoming is > top then push 2 stack
							if (s.priority(str.charAt(i)) > s.priority(x)) {
								s.push(x);
								
								break;
							}
							else{
								res[index] = x;
								index++;
							}
						}
					}
					s.push(str.charAt(i));//higher incoming pushed to stack as well
						
				}
			}
		}
		while(!s.isEmpty()){
			res[index] = s.pop();
			index++;
		}
		System.out.print("Postfix expression: ");
		for (int i=0;i<res.length ;i++ ) {
			System.out.print(res[i]);
		}
	}
}