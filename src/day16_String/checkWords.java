package day16_String;

import java.util.Scanner;

public class checkWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please 3 word");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String result = (word1.length()== word2.length() && word1.length() == word3.length())?
                "All words are same length":(word1.length() != word2.length() &&
                word1.length() != word3.length() && word2.length()!=
                word3.length())?"All different Length":
                "Not same nor Different lengths";
        System.out.println(result);



    }
}
