package day20_WhileLoops;

import java.util.Scanner;

public class tesy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true){
            int num = scan.nextInt();
            if(num< 0){
                break;
            }
            sum += num;
        }
        System.out.println(sum);

    }
}
