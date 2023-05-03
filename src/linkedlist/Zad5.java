package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> ll2=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			ll.add(scan.nextInt());
			int number=ll.get(i);
			int count=0;
			do{
				number/=10;
				count++;
			}while(number!=0);
			ll2.add(count);
			if(ll.get(i)%2==0)
				sum+=ll.get(i);
		}
		System.out.println(ll2);
		System.out.println(sum);
		scan.close();
	}

}
