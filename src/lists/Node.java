package lists;

public class Node<T> {
	Node<T> p;
	Node<T> n;
	T val;
	
	public Node(T e) {
		this.val=e;
	}
	public Node(Node p, T val, Node n) {
		this.n=n;
		this.val=val;
		this.p=p;
	}
	
}
