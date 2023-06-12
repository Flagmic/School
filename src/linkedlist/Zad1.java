package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		LinkedList<Integer> link=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=0;
		int index=0;
		for(int i=0;i<n;i++) {
			link.add(scan.nextInt());
		}
		for(int i=0;i<link.size()-1;i++) {
			if(link.get(i)>link.get(i+1)) {
				temp=link.get(i);
				index=i;
			}
		}
		link.remove(index);
		link.addFirst(temp);
		for(int i=0;i<link.size()-1;i++) {
			if(link.get(i)<link.get(i+1)) {
				temp=link.get(i);
				index=i;
			}
		}
		link.remove(index);
		link.addFirst(temp);
		System.out.println(link);
		scan.close();
	}

}
