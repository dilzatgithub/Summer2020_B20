package day25Recap;

public class evenNumberCount {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10,11};
        int even = 0;
        int odd = 0;
        for (int each : number){
            if (each%2 == 0){
                even += 1;
            }else {
                odd += 1;
            }
        }
        System.out.println("sum of even is "+ even);
        System.out.println("sum of odd is "+ odd);


    }
}
