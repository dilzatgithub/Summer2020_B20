package day36_araaysList;

import java.util.ArrayList;

public class Unique_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i<= list.size()-1; i++){
            Integer element = list.get(i);
            int count =0;
            for (int j = 0; j<= list.size()-1; j++){
                Integer each = list.get(j);
                if (each == element){
                    count++;
                }

            }
            if (count == 1){
                uniques.add(element);
            }


        }
        System.out.println(uniques);






    }
}
