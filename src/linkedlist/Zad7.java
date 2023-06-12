package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(scan.nextInt());
		}
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i)%2==0) {
				ll.add(i+1, ll.get(i)*ll.get(i));
				i++;
				System.out.println(ll);
			}
		}
		
		scan.close();
	}
	
}
