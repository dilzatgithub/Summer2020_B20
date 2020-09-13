package day24_array;

import java.util.Scanner;

public class arrays_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numebr do you want to enter?");
        int usern = scan.nextInt();
        int[] arr = new int[usern];

        for (int i = 0; i<= usern -1;i++){
            System.out.println("please enter a number");
            int num = scan.nextInt();
            arr[i]= num;

//                if (total[i] < min){
//                    System.out.println(min);
//                }
//                if (total[i]> max){
//                    System.out.println(max);
//                }

//        System.out.println("do you want to know the max or min?");
//        String answer = scan.next().toLowerCase();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i <= arr.length-1;i++){
            if (arr[i] < min){
                min = arr[i];

                }
            if (arr[i]> max){
                max = arr[i];

            }
                }
        System.out.println(max);
        System.out.println(min);
        }
    }

