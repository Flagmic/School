package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		Random r= new Random();
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(r.nextInt(10)+1);
		}
		System.out.println(arr);
		System.out.println(checkPalindrome(arr));
		scan.close();
	}

	private static boolean checkPalindrome(ArrayList<Integer> arr) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)!=arr.get(arr.size()-i-1))
				return false;
		}
		return true;
	}

}
