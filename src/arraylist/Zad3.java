package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr.add(scan.nextLine());
		}
		System.out.println(arr);
		for(int i=0;i<13;i++) {
			arr.add(0,arr.get(arr.size()-1));
			arr.remove(arr.size()-1);
			System.out.println(arr);
		}
		scan.close();
	}

}
