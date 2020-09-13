package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        boolean r1 = list.contains(6);
        System.out.println(r1);
        // verify 1,2,4, are contained in the list
        boolean r2 = list.containsAll(Arrays.asList(1,2,4));
        System.out.println(r2);





    }
}
