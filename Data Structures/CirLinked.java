class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
class CircularLinkedList{
	Node last;
	
	void insertE(int data){
		Node node = new Node(data);
		if (last==null) {
			node.next = node;
			System.out.println(data+" is the first node");
		}
		else{
			node.next = last.next;
			last.next = node;
			System.out.println(data+" is added at the end");	
		}
		last = node;
	}

	void insertB(int data){
		Node node = new Node(data);
		if (last==null) {
			node.next = node;
			last = node;
			System.out.println(data+" is the first node");
		}
		else{
			node.next = last.next;
			last.next = node;
			System.out.println(data+" is added at the start");
		}
	}

	void insertA(int prevData, int data){
		if (last==null) {
			System.out.println("List is empty");
		}
		else{
			Node node = new Node(data);
			Node temp = last.next;
			Node first = last.next;
			boolean flag = false;
			do{
				if (temp.data==prevData) {
					node.next = temp.next;
					temp.next = node;
					flag = true;
					break;
				}
				temp = temp.next;
			}while(temp.next!=first.next);
			if (flag) {
			  	System.out.println(data+" was added after "+prevData);
			  }else{
			  	System.out.println(prevData+" was not found in the list");
			  }  
		}
	}

	void show(){
		if (last==null) {
			System.out.println("List is Empty!");
		}
		else{
			System.out.print("The List is: ");
			Node first = last.next;
			Node temp = last.next;
			do{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp.next!=first.next);
			System.out.println();
		}
	}

	void deleteB(){
		if (last==null) {
			System.out.println("List is empty! Deletion not possible");
		}else{
			Node temp = last.next;
			System.out.println("First element i.e "+temp.data+" is deleted");
			last.next = temp.next;
			temp.next = null;/*optional, just felt like doing it so did it anyway!! XD*/ 
		}
	}

	void deleteE(){
		if (last==null) {
			System.out.println("List is empty! Deletion not possible");
		}else{
			Node temp = last.next;
			System.out.println("Last element i.e "+last.data+" is deleted");
			while(temp.next!=last){
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
	}

	void deleteA(int delData){
		if (last==null) {
			System.out.println("List is empty! Deletion not possible");
		}else{
			Node temp = last.next;
			Node first = last.next;
			Node del = null;/*to delete*/
			boolean flag = false;
			do{
				if (temp==last) {/*meaning only one element*/
					last = null;
					break;
				}
				else if (temp.data==delData) {
					last = temp;
					del = temp.next;
					temp.next = del.next;
					flag = true;
					break;
				}else{
					temp = temp.next;
				}
			}while(temp.next!=first.next);
			if (flag) {
				System.out.println("element after "+delData+" was deleted");
			}else{
				System.out.println("The element "+delData+" which was to be deleted was not found in the list");
			}
		}
	}

}
public class CirLinked{
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.show();
		cll.insertE(14);
		cll.insertB(18);
		cll.insertE(16);
		cll.insertA(14,12);
		cll.insertA(20,12);
		cll.show();
		cll.deleteB();
		cll.show();
		cll.deleteE();
		cll.show();
		cll.insertE(13);
		cll.deleteA(12);
		cll.show();
		cll.deleteA(20);
	}
}