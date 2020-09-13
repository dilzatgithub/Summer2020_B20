package day24_array;
import java.util.Arrays;
public class arrays_utility {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(arr));
        String[] names ={"kamran","dilzat","muradil"};
        String s1 = Arrays.toString(names);
        System.out.println(s1);
        int[] num = {1,5,3,5,7,4,5,13,456,76,78,};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int[] arr4 ={1,2,3,4};
        int[] arr5 = {1,2,3,4};
        boolean r1 =Arrays.equals(arr4,arr5);
        System.out.println(r1);








    }
}
