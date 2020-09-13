package day24_array;

public class uniqueNumberForEach {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3,4,5,5,5};
        for (int each: arr){
            int count = 0;
            for (int s : arr){
                if (each == s){
                    count += 1;
                }

            }if (count == 1){
                System.out.println(each);
            }
        }



    }
}
