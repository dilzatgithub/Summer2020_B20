package day30_CustomMethods;

public class returnMethods2 {
    public static void main(String[] args) {
        String str = "level";
      String reversed =  reverse1("level");
        System.out.println(str.equalsIgnoreCase(reversed));
    }
    public static String reverse1(String str){
        String result = "";
        for (int i =str.length()-1; i>= 0;i--){
            result += str.charAt(i);
        }
        return result;
    }
}
