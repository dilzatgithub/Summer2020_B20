package day24_array;

public class average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int result = 0;
        for (int i = 0; i<=arr.length-1;i++){
            sum += arr[i];
        }
        System.out.println(sum/(double)arr.length);




    }
}
