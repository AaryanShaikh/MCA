class Node {
public int data;
public Node left;
public Node right;
public Node parent;

public Node(int data) {
  this.data = data;
  this.parent = null;
  this.left = null;
  this.right = null;
}
}

class SplayTree {
public Node root;

public SplayTree() {
  this.root = null;
}

public Node maximum(Node x) {
  while(x.right != null)
    x = x.right;
  return x;
}

public void leftRotate(Node x) {
  Node y = x.right;
  x.right = y.left;
  if(y.left != null) {
    y.left.parent = x;
  }
  y.parent = x.parent;
  if(x.parent == null) { //x is root
    this.root = y;
  }
  else if(x == x.parent.left) { //x is left child
    x.parent.left = y;
  }
  else { //x is right child
    x.parent.right = y;
  }
  y.left = x;
  x.parent = y;
}

public void rightRotate(Node x) {
  Node y = x.left;
  x.left = y.right;
  if(y.right != null) {
    y.right.parent = x;
  }
  y.parent = x.parent;
  if(x.parent == null) { //x is root
    this.root = y;
  }
  else if(x == x.parent.right) { //x is left child
    x.parent.right = y;
  }
  else { //x is right child
    x.parent.left = y;
  }
  y.right = x;
  x.parent = y;
}

public void splay(Node n) {
  while(n.parent != null) { //node is not root
    if(n.parent == this.root) { //node is child of root, one rotation
      if(n == n.parent.left) {
        this.rightRotate(n.parent);
      }
      else {
        this.leftRotate(n.parent);
      }
    }
    else {
      Node p = n.parent;
      Node g = p.parent; //grandparent

      if(n.parent.left == n && p.parent.left == p) { //both are left children
        this.rightRotate(g);
        this.rightRotate(p);
      }
      else if(n.parent.right == n && p.parent.right == p) { //both are right children
        this.leftRotate(g);
        this.leftRotate(p);
      }
      else if(n.parent.right == n && p.parent.left == p) {
        this.leftRotate(p);
        this.rightRotate(g);
      }
      else if(n.parent.left == n && p.parent.right == p) {
        this.rightRotate(p);
        this.leftRotate(g);
      }
    }
  }
}

public void insert(Node n) {
  Node y = null;
  Node temp = this.root;
  while(temp != null) {
    y = temp;
    if(n.data < temp.data)
      temp = temp.left;
    else
      temp = temp.right;
  }
  n.parent = y;

  if(y == null) //newly added node is root
    this.root = n;
  else if(n.data < y.data)
    y.left = n;
  else
    y.right = n;

  this.splay(n);
}

public Node search(Node n, int x) {
  if(x == n.data) {
    this.splay(n);
    return n;
  }
  else if(x < n.data)
    return this.search(n.left, x);
  else if(x > n.data)
    return this.search(n.right, x);
  else
    return null;
}

public void delete(Node n) {
  this.splay(n);

  SplayTree leftSubtree = new SplayTree();
  leftSubtree.root = this.root.left;
  if(leftSubtree.root != null)
    leftSubtree.root.parent = null;

  SplayTree rightSubtree = new SplayTree();
  rightSubtree.root = this.root.right;
  if(rightSubtree.root != null)
    rightSubtree.root.parent = null;

  if(leftSubtree.root != null) {
    Node m = leftSubtree.maximum(leftSubtree.root);
    leftSubtree.splay(m);
    leftSubtree.root.right = rightSubtree.root;
    this.root = leftSubtree.root;
  }
  else {
    this.root = rightSubtree.root;
  }
}

public void inorder(Node n) {
  if(n != null) {
    inorder(n.left);
    System.out.println(n.data);
    inorder(n.right);
  }
}

public static void main(String[] args) {
  SplayTree t = new SplayTree();

  Node a, b, c, d, e, f, g, h, i, j, k, l, m;
  a = new Node(10);
  b = new Node(20);
  c = new Node(30);
  d = new Node(100);
  e = new Node(90);
  f = new Node(40);
  g = new Node(50);
  h = new Node(60);
  i = new Node(70);
  j = new Node(80);
  k = new Node(150);
  l = new Node(110);
  m = new Node(120);

  t.insert(a);
  t.insert(b);
  t.insert(c);
  t.insert(d);
  t.insert(e);
  t.insert(f);
  t.insert(g);
  t.insert(h);
  t.insert(i);
  t.insert(j);
  t.insert(k);
  t.insert(l);
  t.insert(m);

  t.delete(a);
  t.delete(m);

  t.inorder(t.root);
}
}