package day27_arraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class array_pracrice1 {

    public static void main(String[] args) {
        String[] names = {"Aliya","nurbiya","Ayse"};
        System.out.println(names[1]);
        System.out.println("========================================");
        for (int i =0;i <= names.length-1;i++){
            if (names[i].charAt(0) != 'A'){
            continue;
        }

            System.out.println(names[i]);
    }
        System.out.println("====================");
        int[] numbers = new int[5];
        numbers[0]= 100;
        numbers[3] = 25;
        numbers[3]= 300;
        System.out.println(Arrays.toString(numbers));
        System.out.println("=================");
        Scanner scan = new Scanner(System.in);
        System.out.println("how many names do you want to enter?");
        String [] student = new String[scan.nextInt()];
        scan.nextLine();
        for (int i =0; i<= student.length-1;i++) {
            System.out.println("enter a name");
            student[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(student));











}}
