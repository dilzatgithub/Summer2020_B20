package day29_customMethods;

public class reverseString {

    public static void main(String[] args) {
        reverse("1234");
    }
    public static void reverse(String stringToBeReversed){
        for (int i =stringToBeReversed.length()-1; i >= 0;i--){
            char result = stringToBeReversed.charAt(i);
            System.out.print(result);
        }
        System.out.println();
    }



}
