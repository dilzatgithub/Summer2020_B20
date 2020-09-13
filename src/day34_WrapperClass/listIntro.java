package day34_WrapperClass;

import java.util.ArrayList;

public class listIntro {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(95);
        num.add(100);
        num.add(45);
        num.add(48);
        num.add(0,89);
        System.out.println(num);
        System.out.println(num.get(3));
    }
}
