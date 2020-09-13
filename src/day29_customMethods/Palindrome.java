package day29_customMethods;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("dilzat");

    }





    public static void palindrome(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        if (result.equals(word)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
