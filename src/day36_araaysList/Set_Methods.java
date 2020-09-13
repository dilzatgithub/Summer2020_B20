package day36_araaysList;

import java.util.ArrayList;

public class Set_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(60);
        list1.add(70);

list1.set(list1.size()-1, 0);
        System.out.println(list1);
        System.out.println("=====================");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i =1; i<= 20; i++){
            list2.add(i);
        }
        for (int i = 0; i<= list2.size()-1;i++){
          Integer each = list2.get(i);
          if (each%2 != 0){
              list2.set(i,each*2);
          }else {
              list2.set(i,each*3);
          }

        }
        System.out.println(list2);







    }
}
