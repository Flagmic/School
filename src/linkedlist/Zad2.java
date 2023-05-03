package linkedlist;

import java.util.LinkedList;

public class Zad2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.add(1);
		ll1.add(2);
		ll1.add(3);
		ll1.add(4);
		ll1.add(5);
		LinkedList<Integer> ll2=new LinkedList<Integer>();
		ll2.add(6);
		ll2.add(2);
		ll2.add(3);
		ll2.add(9);
		ll2.add(10);
		LinkedList<Integer> ll3=new LinkedList<Integer>();
		int counter=0;
		for(int i=0;i<ll1.size();i++) {
			if(ll1.get(i)==ll2.get(i)) {
				counter++;
			}
			ll3.add(ll1.get(i)*ll2.get(i));
		}
		System.out.println(counter + "\n" + ll3);
	}

}
