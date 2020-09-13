package day36_araaysList;

public class test {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";
        for (int i =0; i<= str.length()-1;i++){
            String  a = str.charAt(i)+"";
            if (!result.contains(a)){
                result += a;
            }
        }
        System.out.println(result);
    }
}
