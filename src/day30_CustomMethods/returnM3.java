package day30_CustomMethods;

import java.util.Arrays;

public class returnM3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,15,100,46,58};
        int max = max(arr);
        int min = min(arr);
        System.out.println(max + " " + min);





    }






    public static int max(int[] num){
        Arrays.sort(num);
        int max = num[num.length-1];
        return max;
    }

    public static int min(int[] num){
        Arrays.sort(num);
        int min = num[0];
        return min;
    }
}
