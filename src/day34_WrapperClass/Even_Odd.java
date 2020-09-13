package day34_WrapperClass;

import java.util.ArrayList;

public class Even_Odd {
    public static void main(String[] args) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<String> evenList = new ArrayList<>();
        for (int i = 0;i<= 100;i++){
            if (i%2 != 0){
                oddList.add(i);
            }else {
                evenList.add(i+"");
            }
        }
        System.out.println(oddList);
        System.out.println(evenList);
        System.out.println(oddList.size());
        System.out.println("=====================");
        ArrayList<String> grocerList = new ArrayList<>();
        grocerList.add("Milk");
        grocerList.add("Apple");
        grocerList.add("Eggs");
        grocerList.add("Mango");
        grocerList.add("Ice Cream");
        for (int i = grocerList.size()-1; i>= 0; i--){
            System.out.print(grocerList.get(i)+"   ");
        }
        System.out.println();

    }
}
