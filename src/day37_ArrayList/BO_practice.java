package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BO_practice {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("dilzat");
        student.add("kamran");
        student.add("muradil");
        student.add("dilnigar");
        student.add("osman");
        student.add("ziyu");
        boolean r1 = student.containsAll
                (Arrays.asList("dilzat", "ziyu"));
        System.out.println(r1);
        student.removeAll(Arrays.asList("dilzat","kamran"));
        System.out.println(student);


    }
}
