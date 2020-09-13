package day12;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Scanner_01 {
    public static void main(String[] args) {
        System.out.println("please enter your number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        String result = (num1 %2 == 0 )?"the number you entered is a odd number!":
                "the number you entered is a odd number!";
        System.out.println(result);
        }

    }

