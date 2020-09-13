package day37_ArrayList;

import day36_araaysList.Collections_Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class keepUnique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));
        list.removeIf(p -> Collections.frequency(list,p) > 1);
        System.out.println(list);

        System.out.println("=============================");
        ArrayList<Character> listC = new ArrayList<>();
        listC.addAll(Arrays.asList('a','b','c','3','4',
                '5','%','$','*'));
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        for (Character each : listC){
            if (each.isDigit(each)){
                nums.add(each);
            }else if (each.isAlphabetic(each)){
                letters.add(each);
            }else {
                special.add(each);
            }
        }
        System.out.println(letters);
        System.out.println(nums);
        System.out.println(special);

        listC.removeIf(each -> each.isDigit(each));
        listC.removeIf(each -> each.isAlphabetic(each));
        System.out.println(listC);









    }
}
