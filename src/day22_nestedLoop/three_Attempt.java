package day22_nestedLoop;

import java.util.Scanner;

public class three_Attempt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a String");
        String word = scan.next();
        char lastChar = word.charAt(word.length()-1);
        char firstChar = word.charAt(0);
       boolean first= (firstChar>= 65 && firstChar <= 90) && (char)lastChar>=97 && (char)lastChar<= 122;
      // boolean last = (char)lastChar>=97 && (char)lastChar<= 122;
        System.out.println(first);




    }
}
