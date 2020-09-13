package day23_nestedloopss;

public class min_number {
    public static void main(String[] args) {
        int[] arr = {10,20,3,4,5,6,7,-10000,3000,400};
        int min = arr[0] ;
        int max = arr[0] ;
        for (int i =0;i<= arr.length-1;i++){
            if (arr[i]< min){
                min = arr[i];

            }
            if (arr[i]> max){
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);


    }
}
