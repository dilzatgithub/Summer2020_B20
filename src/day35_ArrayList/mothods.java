package day35_ArrayList;

import java.util.ArrayList;

public class mothods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kamran");
        list.add("dilzat");
        list.add("muradil");
        list.add("patamhan");
        list.set(3,list.get(2));
        list.remove("kamran");


        System.out.println(list);


    }
}
