package day16_String;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first word");
        String first = scan.next();
        System.out.println("enter your second word");
        String second = scan.next();
        boolean result = first.length() == 5 && second.length() == 5;
        if(result){
            char fL = first.charAt(first.length() -1);
            char sF = second.charAt(0);
            if(fL == sF){
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }


        }else {
            System.out.println("you need to be exactly 5 chars length");
        }




    }
}
