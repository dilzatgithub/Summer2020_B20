package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClasses {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Integer[] arr2 = {1,2,3,4};
        for (Integer each : arr2){
            System.out.println(each);
        }
        String[] num1 = {"12","13","14","15"};
        double[] num2 = new double[num1.length];
        int i =0;
        for (String each : num1){
            num2[i] = Double.parseDouble(each);
            i++;
        }
        System.out.println(Arrays.toString(num2));

    }
}
