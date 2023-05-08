package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		HashMap<Integer, Integer> hm=new HashMap<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<k;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int T=scan.nextInt();
				if(hm.containsKey(a))hm.put(a,hm.get(a)+T);
				else hm.put(a,T);
				if(hm.containsKey(b+1))hm.put(b+1, hm.get(b+1)-T);
				else hm.put(b+1,-T);
//			System.out.println(hm.toString());
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(hm.containsKey(i))
			sum+=hm.get(i);
			if(sum>max)max=sum;
		}
		
		System.out.println(max);
	
		scan.close();
	}

}
