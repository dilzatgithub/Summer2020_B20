package day25Recap;

public class maxString {
    public static void main(String[] args) {
        String[] arr = {"adam","Nickolas","Amerhan","kamran","dizlat","dee"};
        int max = arr[0].length();
        for (String each: arr){
            int l = each.length();
            if (l > max){
                max = l;
            }
        }
        for (String each : arr){
            if (each.length() == max){
                System.out.println(each);
            }
        }





        }
    }

