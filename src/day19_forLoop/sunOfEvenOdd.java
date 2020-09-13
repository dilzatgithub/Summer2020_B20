package day19_forLoop;

public class sunOfEvenOdd {
    public static void main(String[] args) {
        int sumOfEven = 0;
        for (int i = 0; i <=100; i += 2) {
            sumOfEven += i;


        }
        System.out.println(sumOfEven);
        int sumOfOdd = 0;
        for (int i = 1; i <= 99 ; i += 2){
            sumOfOdd += i;
        }
        System.out.println(sumOfOdd);




    }
}
