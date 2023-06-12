package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(i);
		}
		System.out.println(arr);
		for(int i=arr.size()-1;i>0;i--) {
			if(arr.get(i)%m==0) {
				arr.remove(i);
			}
		}
		System.out.println(arr);
		scan.close();
	}

}
