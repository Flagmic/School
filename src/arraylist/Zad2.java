package arraylist;

import java.util.ArrayList;

public class Zad2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			arr.add(0,(i+1)*(i+1));
			System.out.println(arr);
		}
		
	}

}
