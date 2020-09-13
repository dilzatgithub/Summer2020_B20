package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class removeIf {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 4));
        System.out.println(list);
        Predicate<Integer> lessThan5 = p -> p<5;
        list.removeIf(lessThan5);
        System.out.println(list);
        System.out.println("=========================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 4));
        Predicate<Integer> oddNum = p -> p%2 != 0;
        //list1.removeIf(oddNum);
        list1.removeIf(p-> p%2 == 0);
        System.out.println(list1);
        



    }
}
