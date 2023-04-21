package lists;

import java.util.Arrays;

public class MyLists {

		private Integer[] list= new Integer[10];
		private int size=0;
		public void doubleList() {
			Integer copy[]=list;
			list=new Integer[list.length*2];
			for(int i=0;i<copy.length;i++) {
				list[i]=copy[i];
			}
		}
			public void add(Integer el) {
				if(size==list.length)
					doubleList();
				list[size]=el;
				size++;
			}
		public String toString() {
			return Arrays.toString(list);
		}

}
