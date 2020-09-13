package day39_CustomClass;

import java.util.Scanner;

public class test {
    public static String methods(String one,String two,String three){
       return ""+middle(one)+middle(two)+middle(three);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = methods(scan.next(),scan.next(),scan.next());
        System.out.println(str);
    }
    public static char middle(String s){
        return s.charAt(s.length()/2);
    }
}
