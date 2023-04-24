package Arraylist;

import java.util.ArrayList;

public class Zad1 {
    public static String shorty(ArrayList<String> arr){
       String shortest=arr.get(0);
       for(int i=1;i<arr.size()-1;i++){
        if(arr.get(i).length()<shortest.length())
        shortest=arr.get(i);
       }
       return shortest;
    }
    
}
