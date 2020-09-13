package day31_Recap;

import com.sun.org.apache.xml.internal.utils.res.XResources_zh_TW;

public class methodsprectice {
    public static void main(String[] args) {
        int bigger = maxNumBetween2(2,3);
        System.out.println(bigger);
        String word = "dilzat";
        System.out.println(word.equalsIgnoreCase(reverseString(word)));
        System.out.println(removeDup(word));
    }
    public static int maxNumBetween2(int a, int b){
        int max = a > b ? a : b;
        return max;
    }
    public static String reverseString(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0l ; i--){
            result += str.charAt(i);
        }
        return result;
    }
    private static String removeDup(String str){
        String result = "";
        for (int i = 0; i <= str.length()-1;i++){
            String each = str.substring(i,i+1);
            if (!result.contains(each)){
                result += each;
            }
        }
        return result;
    }

}
