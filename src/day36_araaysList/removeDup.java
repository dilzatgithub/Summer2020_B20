package day36_araaysList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDup {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> nonDop = new ArrayList<>();
        list.addAll(Arrays.asList('A','A','B','B','C','C'));
        for (Character each : list){
            if (!nonDop.contains(each)){
                nonDop.add(each);
            }
        }
        System.out.println(nonDop);
    }
}
