package day24_array;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCDE";
        char[] ch =str.toCharArray();
        System.out.println(Arrays.toString(ch));
        String s1 = "DCEBA";
        String s2 = "ADBCE";
        char[] w1 = s1.toCharArray();
        char[] w2 = s2.toCharArray();
        Arrays.toString(w1);
        Arrays.toString(w2);
        Arrays.sort(w1);
        Arrays.sort(w2);
        boolean h1 =Arrays.equals(w1,w2);
        System.out.println(h1);
        System.out.println("============================================");
        String a1 = "i love Programming language";
        String[] words= a1.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i>= 0;i--){
            System.out.print(words[i]+ " ");
        }
        System.out.println();
        System.out.println("=====================");
        String s = "JAVA";






    }
}
