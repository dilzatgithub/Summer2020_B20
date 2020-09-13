package day29_customMethods;

import java.security.SecureRandom;

public class arrays_Uni {
    public static void main(String[] args) {
        String[] arr = {"A","A","B","C","C"};
        for (String a : arr){
            int count = 0;
            for (String each : arr){

                if (a.equals(each)){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(a);
            }
        }









    }
}
