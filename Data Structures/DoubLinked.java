class Node{
	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}
class DoublyLinkedList{
	Node head;

	void insertE(int data){
		Node node = new Node(data);
		if (head==null) {
			head = node;
			node.prev = head;
			System.out.println(data+" is the first node as list is empty!");
		}else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
			System.out.println(data+" is added at the end of the list");
		}
	}

	void insertB(int data){
		Node node = new Node(data);
		if (head==null) {
			head = node;
			node.prev = head;
			System.out.println(data+" is the first node as list is empty!");
		}else{
			node.next = head;
			head.prev = node;
			head = node;
			node.prev = head;
			System.out.println(data+" is added at the start of the list");
		}
	}

	void insertA(int afterData,int data){
		Node node = new Node(data);
		if (head==null) {
			System.out.println("The list is empty so there's no "+afterData+" in the list");
		}else{
			Node temp = head;
			do{
				if (temp.data==afterData) {
						node.prev = temp;
						node.next = temp.next;
						temp.next = node;
						temp = temp.next;
						temp = temp.next;
						temp.prev = node;
						System.out.println(data+" is added after "+afterData);
						break;
					}else{
						temp = temp.next;	
					}	
			}while(temp.next!=null);
		}
	}

	void deleteE(){
		if (head==null) {
			System.out.println("The List is empty");
		}else{
			Node temp = head;
			if (temp.next==null) {
				System.out.println(temp.data+" was the last element in the list!");
				head = null;
			}else{
				while(temp.next!=null){
				temp = temp.next;
				}
				System.out.println(temp.data+" is removed from the end of the list");
				temp = temp.prev;
				temp.next = null;
			}
		}
	}

	void deleteB(){
		if (head==null) {
			System.out.println("The List is empty");
		}else{
			Node temp = head;
			if (temp.next==null) {
				System.out.println(temp.data+" was the last element in the list!");
				head = null;
			}else{
				System.out.println(temp.data+" is removed from the start of the list");
				temp = temp.next;
				temp.prev = temp;
				head = temp;
			}
		}
	}

	void deleteA(int delData){
		if (head==null) {
			System.out.println("The List is empty");
		}else{
			Node temp = head;
			if (temp.next==null&&temp.data!=delData) {
				System.out.println(delData+" was not found in the list!");
			}else{
				Node del = temp;
				while(temp.data!=delData){
					temp = temp.next;
				}
				del = temp.next;
				System.out.println("The data after "+delData+" i.e "+del.data+" is removed from the list");
				temp.next = del.next;
				/*just to be on a save side*/
				del.next = null;
				del.prev = null;
			}
		}
	}

	void show(){
		if (head==null) {
			System.out.println("The List is empty");
		}else{
			Node temp = head;
			System.out.print("The List is : ");
			while(temp.next!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}

}

public class DoubLinked{
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertE(16);
		dll.insertE(15);
		dll.insertB(14);
		dll.insertA(16,17);
		dll.show();
		dll.deleteE();
		dll.show();
		dll.deleteB();
		dll.show();
		dll.insertE(18);
		dll.show();
		dll.deleteA(16);
		dll.show();
	}
}