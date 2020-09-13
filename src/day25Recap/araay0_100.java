package day25Recap;

public class araay0_100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i =0; i <= numbers.length-1 ;i ++){
            numbers[i]= i+1;
        }
        for (int even : numbers){
            if (even%2 == 0){
                System.out.print(even+ " ");
            }
        }



    }
}
