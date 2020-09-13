package day33_MethodsAndTime;

import java.util.Arrays;

public class teast {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,34,56,54,32,12,5,};
        Arrays.sort(arr);
        int temp = 0;
        for (int i =0; i< arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-(1+i)];
            arr[arr.length-(1+i)] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
