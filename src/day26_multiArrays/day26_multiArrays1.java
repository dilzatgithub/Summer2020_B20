package day26_multiArrays;

import java.util.Arrays;

public class day26_multiArrays1 {
    public static void main(String[] args) {
        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = {'F','G','H'};
        char[][] D2 = {{'A','B'},{'C','D','E'},{'F','G','H'}};
        System.out.println(Arrays.toString(D2[2]));
        System.out.println(D2[1][0]);

        System.out.println(D2[2][1]+ " " + D2[0][1] );
        System.out.println("===================================");
        int[][] arrd2 = {{1,2,3,},{4},{5,6,},{7,8,9,10}};
        for (int i = 0; i<= arrd2.length-1;i++){
            System.out.println(Arrays.toString(arrd2[i]));
        }




    }
}
