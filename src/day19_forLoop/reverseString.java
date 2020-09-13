package day19_forLoop;

public class reverseString {
    public static void main(String[] args) {
        String str = "i had a really awesome day, i love it";
        int firstChar = str.charAt(0);
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i-- ){
            result += str.charAt(i);


        }
        System.out.print(result);



    }
}
