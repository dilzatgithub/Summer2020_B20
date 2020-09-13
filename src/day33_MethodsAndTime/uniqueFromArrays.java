package day33_MethodsAndTime;

public class uniqueFromArrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,6,6};

        for (int element : arr){
            int count = 0;
            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
                if (count == 1){
                    System.out.println(element);
                }

        }
        int[] num = {12,34,34,12,45,66,77,45,45};
        uniqueElement(num);



    }
    public static void uniqueElement(int[] arr){
        for (int element : arr){
            int count = 0;
            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1){
                System.out.print(element+" ");
            }


        }
        System.out.println();
    }






}
