package day16_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        char firstC = word.charAt(0);
        char lastC = word.charAt(word.length() - 1);
        boolean result = (firstC == lastC)?true:false;
        System.out.println(result);


    }

}
