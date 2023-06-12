package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//generation
		for(int i=0;i<n;i++) {
			arr.add(random.nextInt(30)+50);
		}
		System.out.println(arr);
		//sorting
		for(int i=0;i<arr.size();i++) {
			for(int j=1;j<arr.size()-i;j++) {
				if(arr.get(j)<arr.get(j-1)) {
					int temp=arr.get(j);
					arr.set(j, arr.get(j-1));
					arr.set(j-1, temp);
				}
			}
		}

		System.out.println(arr);
		//removing same elements
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i)==arr.get(i+1)) {
				arr.remove(i);
				i--;
			}
		}
		System.out.println(arr);
		//adding new ones
		for(int i=0;i<arr.size();i++) {
			if(i>=arr.size())
				break;
			if(arr.get(i)==arr.get(i+1)-1) {
				i++;
			}else {
				arr.add(i+1,arr.get(i)+1);
			}
			
		}
		System.out.println(arr);
		scan.close();
	}

}
