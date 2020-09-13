package day16_String;

import java.util.Scanner;

public class lyReally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
        String result = (word.endsWith("ly"))?"really???":"never mind";



    }
}
