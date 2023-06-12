package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad1 {
    public static String shorty(ArrayList<String> arr){
    	String shortest=arr.get(0);
    	String toReturn=arr.get(0);
    	for(int i=1;i<arr.size();i++) {
    		if(shortest.length()>arr.get(i).length()) {
    			shortest=arr.get(i);
    			toReturn=arr.get(i);
    		}else if(shortest.length()==arr.get(i).length()) {
    		toReturn+=" "+arr.get(i);	
    		}
    		
    	}
    	return toReturn;
    }
    public static void main(String[] args) {
    	ArrayList<String> arr=new ArrayList<String>();
    	Scanner scan=new Scanner(System.in);
    	for(int i=0;i<5;i++)
    	arr.add(scan.nextLine());
    	System.out.println(shorty(arr));
    	scan.close();
    }
}
