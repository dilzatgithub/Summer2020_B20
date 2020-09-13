package day36_araaysList;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(12);
        list.add(15);
        list.add(30);
        list.add(45);
        list.add(25);
        Collections.sort(list);
        for (int i = list.size()-1; i>= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("==================");
        ArrayList<String> list2 = new ArrayList<>();







    }
}
