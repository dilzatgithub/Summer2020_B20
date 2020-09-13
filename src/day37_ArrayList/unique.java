package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class unique {
    public static void main(String[] args) {
        String str = "ABABCDEE";

        ArrayList<Character> list = new ArrayList<>();
        for (Character each : str.toCharArray()){
            list.add(each);
        }
        for (Character each :list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                System.out.print(each+" ");
            }
        }
        System.out.println();



    }
}
