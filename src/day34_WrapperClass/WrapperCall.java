package day34_WrapperClass;
import Library.Util;

import java.util.Arrays;

public class WrapperCall {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {5,6,7,8,9};
       Integer[] arr3 = Util.combine2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println(Util.maxNum(arr3));

    }
}
