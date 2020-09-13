package day30_CustomMethods;

import java.util.Arrays;

public class recap {
    public static void main(String[] args) {
        maxNumber(4,5);
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,4,3,2,1};
        combine(arr1,arr2);
        int[] arr3 = {12,30,-90,0,33,-45};
        for (int each : arr3){
            PosNegZero(each);
        }




    }
    public static void maxNumber(int num1,int num2){
        if (num1 == num2){
            System.out.println("its the same");
            return;
        }
        if (num1>=num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
    public static void combine(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i =0;
        for (int each : arr1){
            arr3[i] = each;
            i++;
        }
        for (int each1 : arr2){
            arr3[i] = each1;
            i++;

        }
        System.out.println(Arrays.toString(arr3));
    }
    public static void PosNegZero(int num){
        String result =(num == 0)?"num is: "+ num:(num <0)?num+" is Neg":
                num+ " is Pos";
        System.out.println(result);
    }
}


