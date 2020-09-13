package day29_customMethods;

public class removeDup {
    public static void main(String[] args) {
        removeDuplicate("aabbccccbbbdnnnrrtiiiw");
        int[] arr = {1,2,3,4,5,34,5,42,312,134,-123,0};
        maxNum(arr);
    }
    public static void removeDuplicate(String str){
        String nonDup = "";
        for (String each:str.split("")){
            if (!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }

    public static void maxNum(int[] arr){
        int max =arr[0];
        for (int each : arr){
            if (each> max){
                max = each;
            }
        }
        System.out.println("max number is: "+  max);
    }





}
