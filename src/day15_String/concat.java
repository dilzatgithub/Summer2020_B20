package day15_String;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a car name");
        String sentence = input.nextLine();
        char s1 = '!';
        String c1 = sentence.concat(s1+ "wtf man "+ s1);
        System.out.println(c1);
    }
}
