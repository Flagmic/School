package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			ll.add(scan.nextInt());
		}
		System.out.println(ll);
		Outer_Loop:
		for(int i=0;i<ll.size();i++) {
			boolean end=true;
			for(int j=i;j<ll.size();j++) {
				if(ll.get(j)%2!=0) {
					end=false;
					break;
					
				}
			}
			if(end) break Outer_Loop;
				if(ll.get(i)%2==0) {
				ll.add(ll.get(i));
				ll.remove(i);
				i--;
				System.out.println(ll);
			}
		}
		
		scan.close();
	}

}
