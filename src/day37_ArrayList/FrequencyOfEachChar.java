package day37_ArrayList;

import Library.Util;
import day36_araaysList.Collections_Utility;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String str = "AAABBC";
        ArrayList<Character> list = new ArrayList<>();
        for (Character each : str.toCharArray()){
            list.add(each);
        }
        String nonDop = Util.removeDup(str);
        for (Character each : nonDop.toCharArray()){
            int count = Collections.frequency(list,each);
            System.out.print(each+""+count);
        }





    }
}
