package day32_overLode;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class methodOverLoading {
    public static int[] combineArrays(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i =0;
        for (int each : arr1){
            arr3[i] = each;
            i++;
        }
        for (int each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    public static double[] combineArrays(double[] arr1,double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];
        int i =0;
        for (double each : arr1){
            arr3[i] = each;
            i++;
        }
        for (double each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    public static char[] combineArrays(char[] arr1,char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];
        int i =0;
        for (char each : arr1){
            arr3[i] = each;
            i++;
        }
        for (char each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }
    public static String[] combineArrays(String[] arr1,String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];
        int i =0;
        for (String each : arr1){
            arr3[i] = each;
            i++;
        }
        for (String each : arr2){
            arr3[i] = each;
            i++;
        }
        return arr3;
    }






}
