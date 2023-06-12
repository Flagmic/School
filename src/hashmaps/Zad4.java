package hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Zad4 {

	public static void main(String[] args) {
		Queue<Integer> hand1=new LinkedList<Integer>();
		Queue<Integer> hand2=new LinkedList<Integer>();
		Random r=new Random();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=1;i<=12;i++) {
			arr.add(i);
			arr.add(i);
		}
		for(int i=0;i<12;i++) {
			int index=r.nextInt(arr.size());
			hand1.add(arr.get(index));
			arr.remove(index);
			index=r.nextInt(arr.size());
			hand2.add(arr.get(index));
			arr.remove(index);
		}
		while(!(hand1.isEmpty()) && !(hand2.isEmpty())) {
			int card1=hand1.poll();
			int card2=hand2.poll();
			if(card1>card2) {
				hand1.add(card2);
				hand1.add(card1);
			}
			else if(card2>card1) {
				hand2.add(card1);
				hand2.add(card2);
			}
			System.out.println(hand1);
			System.out.println(hand2);
			System.out.println();
		}
		if(hand1.isEmpty())
			System.out.println("Player 2 wins");
		else
			System.out.println("Player 1 wins");
	}

}
