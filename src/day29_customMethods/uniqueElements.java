package day29_customMethods;

public class uniqueElements {
    public static void main(String[] args) {
        String[] arr = {"A","B","B","E","C","A"};
        uniques(arr);
    }
    public static void uniques(String[] arr){
        for (String a : arr){
            int count = 0;
            for (String each : arr){

                if (a.equals(each)){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(a);
            }
        }
    }

}
