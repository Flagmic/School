package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			ll.add(scan.nextInt());
			sum+=ll.get(i);
		}
		System.out.println(sum);
		while(sum!=0) {
			sum/=10;
			count++;
		}
		System.out.println(count);
		scan.close();
		
	}

}
