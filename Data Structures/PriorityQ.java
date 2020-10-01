import java.util.*;
class PQueue{
	int max = 10;
	int pqarr[] = new int[max];
	int count = 0;
	void enqueue(int x){
		if (!isFull()) {
			int i;
			if (count == 0) {
				pqarr[0] = x;
				count++;
			}
			else{
				for (i=count-1;i>=0 ;i-- ) {
					if (x>pqarr[i]) {
						pqarr[i+1] = pqarr[i];
					}
					else{
						break;
					}
				}
				pqarr[i+1] = x;
				count++;
			}
			System.out.println("Value Added Successfully");
		}
		else{
			System.out.println("Queue is full");
		}
	}
	void display(){
		if (!isEmpty()) {
			System.out.print("Queue:");
			for (int i=count-1;i>=0 ;i-- ) {
				System.out.print(pqarr[i] + " ");
			}
			System.out.println();
		}
		else{
			System.out.println("Queue is Empty");
		}
	}
	boolean isFull(){
		return count == max;
	}
	boolean isEmpty(){
		return count == 0;
	}
	int dequeue(){
		if (!isEmpty()) {
			System.out.println("value removed Successfully");
			return pqarr[--count];	
		}
		else{
			System.out.println("Nothing is There!");
			return 0;
		}
	}
	int peek(){
		if (!isEmpty()) {
			return pqarr[count-1];
		}
		else{
			System.out.println("Queue is empty");
			return 0;
		}
	}
}
public class PriorityQ{
	public static void main(String[] args) {
		PQueue pq = new PQueue();
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while(check){
			System.out.println("Lower the number, Higher the Priority!");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Peek");
			System.out.println("---Any other number to exit---");
			int ch = in.nextInt();
			switch(ch){
				case 1: 
						System.out.println("Enter the number you want to input!");
						int num = in.nextInt();
						pq.enqueue(num);
					break;
				case 2:
						pq.dequeue();
					break;
				case 3:
						pq.display();
					break;
				case 4:
						System.out.println("Peek:"+pq.peek());
					break;
				default: 
					check = false;
					break;
			}
		} 
	}
}