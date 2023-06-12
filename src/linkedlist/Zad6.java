package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(scan.nextInt());
		}
		System.out.println(ll);
		for(int i=0;i<ll.size()/2;i++) {
			ll.add(i,ll.get(ll.size()-i-1));
			ll.remove(ll.size()-i-1);
			ll.add(ll.size()-i, ll.get(i+1));
			ll.remove(i+1);
		}
		System.out.println(ll);
		scan.close();
	}
	
}
