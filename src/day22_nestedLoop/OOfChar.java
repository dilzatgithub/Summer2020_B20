package day22_nestedLoop;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

import java.util.Scanner;

public class OOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char ch = 'a';
        int count = 0;
        for (int i = 0; i<= str.length()-1;i++){
            char each = str.charAt(i);
            if(each == ch){
                count += 1;

            }



        }
        System.out.println(count);




    }
}
