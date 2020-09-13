package day25Recap;

public class shortestString {
    public static void main(String[] args) {
        String[] arr = {"adam","Nickolas","Amerhan","kamran","dizlat","dee"};


        int minLength = arr[0].length();
        for (int i = 0; i <= arr.length-1;i++){// fine the min length of Str
            int l = arr[i].length();// 4, 8, 4,8
            if (l < minLength){
                minLength = l;

            }
        }

        for (int i =0; i<= arr.length-1;i++){
            if (arr[i].length() == minLength){
                System.out.println(arr[i]);
            }
        }



    }
}
