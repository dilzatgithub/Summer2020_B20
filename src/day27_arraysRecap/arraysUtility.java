package day27_arraysRecap;

import java.util.Arrays;

public class arraysUtility {
    public static void main(String[] args) {
        int[] number = {2,3,4,5,1,2,5,100,45,22,32};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println("min number is: " + number[0]);
        System.out.println("max number is: "+ number[number.length-1]);





    }
}
