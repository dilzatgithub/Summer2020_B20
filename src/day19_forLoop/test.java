package day19_forLoop;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int wLength = word.length();
        int middle = wLength/2 -1;
        String result = "";
        if(wLength >= 5 && wLength%2 != 0 ){
            result = word.substring(middle,middle + 3);


        }else {
            System.out.println("invalid");
        }
        System.out.println(result);

    }
}
