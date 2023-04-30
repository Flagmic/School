package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		ArrayList<Integer> arrayListPrime=new ArrayList<Integer>();
		int n=scan.nextInt();
			for(int i=0;i<n;i++) {
				arrayList.add(random.nextInt(20000)+1);
			}
			System.out.println(arrayList);
			System.out.print("Not prime: ");
		for(int i=0;i<arrayList.size();i++) {
			boolean prime=true;
			for(int j=2;j<arrayList.get(i)-1;j++) {
				if(arrayList.get(i)%j==0) {
					prime=false;
					break;
				}
			}
			if(prime && arrayList.get(i)!=1)
				arrayListPrime.add(arrayList.get(i));
			else
				System.out.print(arrayList.get(i)+ " ");
		}
		System.out.println();
		System.out.print("Prime: " + arrayListPrime);
		scan.close();
	}


}
