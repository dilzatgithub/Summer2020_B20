package day38_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_methods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infinity",
                "Tesla","VW","Lambo","Lexus"));
//        cars.retainAll(Arrays.asList("Tesla"));
//        cars.removeIf(p-> p.toLowerCase().contains("m"));
//
//        cars.remove(3);
//        cars.remove("Tesla");

        System.out.println(cars);
        System.out.println("==================================");
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Eggs","Milk","Paper Towels","Mango"
        ,"Orange","Avocado"));
        System.out.println(list.contains("coke"));



    }
}
