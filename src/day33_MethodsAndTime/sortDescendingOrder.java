package day33_MethodsAndTime;

import java.util.Arrays;

public class sortDescendingOrder {
    public static void main(String[] args) {

        int[] arr = {12,412,21,1,2,5,6,4,8,99};
        Arrays.sort(arr);
        int[] reversed = new int[arr.length];
        int i = 0;
        for (int each : arr){
            reversed[i] = arr[arr.length-(1+i)];
            i++;
        }
        System.out.println(Arrays.toString(reversed));

    }


    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] reversed = new int[arr.length];
        int i = 0;
        for (int each : arr){
            reversed[i] = arr[arr.length-(1+i)];
            i++;
        }
        return reversed;
    }
}
