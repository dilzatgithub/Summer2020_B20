package day21_Loops;

import java.util.Scanner;

public class min_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 200000000;
        int max = -999999999;
        for (int i = 1; i <= 5; i ++){
            System.out.println("enter a number");
            int num = scan.nextInt();
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }System.out.println("min number is: "+min);
        System.out.println("max number is: "+ max);





    }
}
