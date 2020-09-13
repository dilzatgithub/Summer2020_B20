package day16_String;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String st1 = input.next();
        System.out.println("Enter 2nd word");
        String st2 = input.next();
      String result =  st1.substring(1).concat(st2.substring(1));
        System.out.println(result);




    }
}
