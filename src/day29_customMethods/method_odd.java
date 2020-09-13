package day29_customMethods;

import java.util.Scanner;

public class method_odd {
    public static void oddB0_100() {
        Scanner scan = new Scanner(System.in);
        System.out.println("whats the number?");
        int a = scan.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void evenB0_100() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }


    public static void main(String[] args) {
        oddB0_100();
        evenB0_100();
    }
}