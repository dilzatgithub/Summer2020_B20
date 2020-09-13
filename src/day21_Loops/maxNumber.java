package day21_Loops;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        for (int i =1; i<=5 ; i++){
            System.out.println("please enter a number");
            int num = scan.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);




    }
}
