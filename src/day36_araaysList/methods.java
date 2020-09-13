package day36_araaysList;

import java.util.ArrayList;

public class methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(40);
        int a = list.indexOf(40);
        System.out.println(a);
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(40));


    }
}
