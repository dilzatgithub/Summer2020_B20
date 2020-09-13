package day15_String;

import java.util.Scanner;

public class testTTT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence = input.nextLine();
        char firstL = sentence.charAt(0);
        int totalC = sentence.length();
        char lastL = sentence.charAt(totalC -1);
        System.out.println(firstL+" "+ lastL);






    }
}
