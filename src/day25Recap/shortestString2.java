package day25Recap;

public class shortestString2 {
    public static void main(String[] args) {
        String[] arr = {"adam","Nickolas","Amerhan","kamran","dizlat","dee"};
        int minLength =arr[0].length();

        for (String each : arr ){
            int l = each.length();
            if (l<minLength){
                minLength = l;
            }
        }
        for (String each : arr){
            if (each.length() == minLength){
                System.out.println(each);
            }
        }


    }
}
