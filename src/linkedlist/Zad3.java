package linkedlist;

import java.util.LinkedList;

public class Zad3 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(0);
		ll.add(0);
		ll.add(1);
		ll.add(3);
		ll.add(0);
		ll.add(1234);
		ll.add(0);
		ll.add(2);
		ll.add(0);
		ll.add(0);
		ll.add(111);
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i)==ll.get(i+1) && ll.get(i)==0) {
				ll.remove(i);
				ll.remove(i);
				
			}
		}
		System.out.println(ll);
	}

}
