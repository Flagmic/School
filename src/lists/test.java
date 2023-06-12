package lists;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		MyLists list=new MyLists();
		Random r=new Random();
		for(int i=0;i<100;i++) {
			list.add(r.nextInt(21)+5);
		}
		System.out.println(list.toString());
	}

}
