package day28_recap_Arrays_Loops;

import java.util.Arrays;

public class Find_frequency {
    public static void main(String[] args) {
        String str = "javaJavaJAVA";
        String word = "java";
        int count =0;
        for (int i =0;i<=str.length()-4;i++){
            if (str.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }


        }

        System.out.println(count);
        System.out.println("====================================");
        String[] arr = {"Java","C#","python","Java"};
        int countOfWord = 0;
        for (String each : arr){
            if (each.equalsIgnoreCase("java")){
                countOfWord++;
            }
        }
        System.out.println(countOfWord);

        System.out.println("===========================");
        String email = "cybertek@gmail.com";
        String[] split = email.split("@");
        System.out.println("name: "+ split[0]);
        System.out.println("domain: " +
                split[1].substring(0,split[1].indexOf('.')));

















    }

}
