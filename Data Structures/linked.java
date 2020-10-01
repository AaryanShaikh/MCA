class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head;

	void insertE(int num){
		Node node = new Node();
		node.data = num;
		node.next = null;//this can be default

		if (head==null) {
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	void show(){
		Node temp = head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	void insertB(int num){
		Node node = new Node();
		node.data = num;
		node.next = null;

		node.next = head;
		head = node;
	}

	void insertA(int loc, int num){
		Node node = new Node();
		node.data = num;
		node.next = null;
		
		Node temp = head;
		while(temp.data!=loc){
			temp = temp.next;
		}
		Node val = temp.next;
		temp.next = node;
		node.next = val;
	}

	void delete(int num){
		/*Node node = new Node();*/
		Node prev = new Node();
		prev.next = null;
		Node temp = head;
		int count = 0;
		while(temp.data!=num){
			prev = temp;
			temp = temp.next;
			count++;
		}
		if (count==0) {
			head = temp.next;
		}else{
			prev.next = temp.next;
		}
	}
}
public class Linked{
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertE(25);
		l.insertE(38);
		l.insertE(56);
		l.insertB(15);
		l.insertA(38,39);
		l.delete(15);
		l.show(); 
	}
}