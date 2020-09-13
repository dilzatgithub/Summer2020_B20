package day43_staticBlock;

import day42_static.Tester;

public class staticBlock2 {
    static int a ;
    static String b;
    static Tester tester1;

    static {
        a = 100;
        b = "Cybertek";
    }


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
