package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double average=0;
		for(int i=0;i<n;i++) {
			ll.add(scan.nextInt());
			average+=ll.get(i);
		}
		average/=ll.size();
		System.out.println(average);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i)<=average) {
				ll.remove(i);
				i--;
				System.out.println(ll);
			}
		}
		scan.close();
	}

}
