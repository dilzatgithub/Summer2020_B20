package day19_forLoop;

public class palindromeTest {
    public static void main(String[] args) {
        String str = "civic";
        String result = "";
        for (int i = str.length()-1; i >= 0; i --){
          result += str.charAt(i);




        }
        System.out.println(result);
        System.out.println(str.equals(result));





    }
}
