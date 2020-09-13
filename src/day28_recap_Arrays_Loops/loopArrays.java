package day28_recap_Arrays_Loops;

public class loopArrays {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8},{9,10,11,12,13,14,15}};
        for (int each[] : arr){
            for (int eachNum:each ) {
                if (eachNum % 2 != 0) {
                    System.out.print(eachNum + " ");
                }
            }
            System.out.println();
        }
//        for (int i =0; i<= arr.length-1;i++){
//            for (int j = 0; j<= arr[i].length-1;j++){
//                System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println();
//        }





    }
}
