package day20_WhileLoops;

import java.util.Scanner;

public class reverseName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "wtf man";
        String result = "";
        int index = str.length() -1 ;
        while (index >= 0){
            result += str.charAt(index);
            index --;
        }
        System.out.println(result);





    }
}
