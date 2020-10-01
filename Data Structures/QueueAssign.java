import java.util.*;
class Queue{
	int qarr[] = new int[5];
	int front=-1,rear=-1;
	void enqueue(int x){
		if (isFull()) {
			System.out.println("Queue is Full!");
		}
		else{
			if (isEmpty()) {
				front = 0;
				rear = 0;
			}
			else{
				rear++;
			}
			System.out.println("Value Entered Successfully!");
			qarr[rear] = x;
		}
	}
	boolean isEmpty(){
		if (rear==-1&&front==-1) {
			return true;
		}
		else{
			return false;
		}
	}
	void dequeue(){
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		else if(front == rear){
			front = -1;
			rear = -1;
		}
		else{
			front++;
			System.out.println("Value removed Successfully!");
		}
	}
	void show(){
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else{
			System.out.print("Queue: ");
			for (int i=front;i<=rear ;i++ ) {
				System.out.print(qarr[i]+" ");
			}
			System.out.println();
		}
	}
	void peek(){
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else{
			System.out.println("Peek value:"+qarr[front]);	
		}
	}
	boolean isFull(){
		if(rear > 5){
			return true;
		}
		else{
			return false;
		}
	}
}
public class QueueAssign{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = true;		 
		Queue q = new Queue();
		while(check){
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Show");
			System.out.println("4.Peek");
			System.out.println("---any other number to exit---");
			int choice = in.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the number to input");
					int num = in.nextInt();
					q.enqueue(num);
					break;
				case 2:
					q.dequeue();
					break;
				case 3:
					q.show();
					break;
				case 4:
					q.peek();
					break;
				default: check = false;
					break;		
			}
		}
	}
}