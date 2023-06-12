package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		for(int i=0;i<n;i++) {
			hm.put(i, scan.nextInt());
		}
		for(int i=0;i<hm.size();i++) {
			int rest=k-hm.get(i);
			if(hm.containsValue(rest)) {
				System.out.println("Integers: "+i+" "+hm.entrySet());
				
				break;
			}
		}
		System.out.print(hm);
		scan.close();
	}

}
