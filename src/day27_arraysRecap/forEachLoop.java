package day27_arraysRecap;

import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70,80,90,100,110};
        for (int each: numbers){
            if (each%3 != 0){
                continue;
            }else {
                System.out.print(each+" ");
            }
        }
        System.out.println();
        System.out.println("====================");
        String[] names = {"AC","ABC","AB","ABCD",};
        for (String each : names){
            if (!each.contains("C")){
                continue;
            }else {
                System.out.println(each);
            }

        }






    }
}
