package day28_recap_Arrays_Loops;

public class multiArrays_02 {
    public static void main(String[] args) {

        int[][] arr2d = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
        for (int i = arr2d.length-1; i>=0;i--){
            int[] eachNum = arr2d[i];
            for (int j = 0; j<= eachNum.length-1;j++){
                System.out.print(eachNum[j]+ " ");
            }
            System.out.println();
        }



    }
}
