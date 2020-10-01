import java.util.*;
class CQueue{
	int front=0,rear=0,size=5,count=0,data=0;
	int qarr[] = new int[size];
	void enqueue(int x){
		if (isFull()) {
			System.out.println("Queue is Full");	
		}else{
			qarr[rear] = x;
			rear = (rear+1)%size;
			count++;
			System.out.println(x+" is added to the Queue");
		}
	}
	boolean isEmpty(){
		return count==0;
	}
	int dequeue(){
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return 0;
		}else{
			data = qarr[front];
			front = (front+1)%size;
			count--;
			System.out.println(data+" is removed from the Queue");
			return data;
		}
	}
	void display(){
		System.out.print("Queue:");
		for (int i=0;i<count ;i++ ) {
			System.out.print(qarr[(front+i)%size]+" ");
		}
		System.out.println();
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
		return count == size;	
	}
}
public class CirQueue{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = true;		 
		CQueue cq = new CQueue();
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
					cq.enqueue(num);
					break;
				case 2:
					cq.dequeue();
					break;
				case 3:
					cq.display();
					break;
				case 4:
					cq.peek();
					break;
				default: check = false;
					break;		
			}
		}
	}
}