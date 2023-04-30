package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		LinkedList<Integer> link=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			link.add(scan.nextInt());
		}
		for(int i=link.size()-1;i>0;i--) {
			if(link.get(i)<link.get(i-1)) {
				int temp=link.get(i);
				link.set(i, link.get(i-1));
				link.set(i-1, temp);
			}
		}
		for(int i=link.size()-1;i>1;i--) {
			if(link.get(i)>link.get(i-1)) {
				int temp=link.get(i);
				link.set(i, link.get(i-1));
				link.set(i-1, temp);
			}
		}
		System.out.println(link);
	}

}
