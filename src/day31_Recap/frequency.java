package day31_Recap;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        String str = "aabbdcceeag";
        String uniques = "";
        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }

        String str2 = "aaabccdeeeutr";
        System.out.println(uniques(str2));





    }



    public static int frequency(String str,char ch){// find frequency of
        //char from String
        int count = 0;
        for (char each :str.toCharArray()){
            if (each == ch){
                count++;
            }
        }
        return count;
    }
    public static String uniques(String str){
        String uniques = "";
        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
    }




}
