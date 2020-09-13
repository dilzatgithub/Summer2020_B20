package day36_araaysList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(12);
        list.add(15);
        list.add(30);
        list.add(45);
        list.add(25);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("max is " + list.get(list.size()-1));

    }
}
