class Node{
	int data;
	Node left,right;
}
class BST{
	public Node createNewNode(int k){
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	
	public Node insert(Node node, int val){
		if (node==null) {
			return createNewNode(val);
		}
		if (val < node.data) {
			node.left = insert(node.left, val);
		}else{
			node.right = insert(node.right, val);
		}
		return node;
	}
	
	public Node delete(Node node,int val){
		if (node==null) {
			return null;
		}
		if (val<node.data) {
			node.left = delete(node.left,val);
		}else if(val > node.data){
			node.right = delete(node.right,val);
		}else{
			if (node.left == null || node.right==null) {
				Node temp = null;
				temp = node.left == null ? node.right : node.left;
				if (temp==null) {
					return null;
				}else{
					return temp;
				}
			}else{/* if both childs exist find inorder successor*/
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right,val);
				return node;
			}
		}
		return node;
	}

	public Node getSuccessor(Node node){
		if (node==null) {
			return null;
		}

		Node temp = node.right;
		while(temp.left!=null){
			temp = temp.left;
		}
		return temp;
	}  
}
public class BSTID{
	public static void main(String[] args) {
		BST bst = new BST();
		Node root = null;
		root = bst.insert(root,8);
		root = bst.insert(root,3);
		root = bst.insert(root,6);
		root = bst.insert(root,10);
		root = bst.insert(root,4);
		root = bst.insert(root,7);
		root = bst.insert(root,1);
		root = bst.insert(root,14);
		root = bst.insert(root,13);
		root = bst.delete(root,1);/*no child*/
		root = bst.delete(root,14);/*1 child*/
		root = bst.delete(root,6);/*2 childs*/
	}
}