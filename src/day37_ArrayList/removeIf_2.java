package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIf_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary","Monica","Mehray","Musti"
        ,"Sumeyra","Hasan","Beril"));
        names.removeIf(p-> p.startsWith("M"));
        System.out.println(names);







    }
}
