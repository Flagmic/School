package lists;

public class MyLinkedList<T> {
	private Node<T> last;
	private Node<T> first;
	private int size;
	
	public void add(T e) {
		if(size==0) {
			first=new Node<>(e);
			last=first;
		}else {
			Node<T> n = new Node<>(last, e, null);
			last=n;
		}
		size++;
	}
}
