package day03EscapeSequencesVariables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Salary {
    public static void main(String[] args) {

        int salary = 100000;
        double tax = 0.28;
        double totaltax = salary * tax;
        double salaryaftertax = salary - totaltax;
        System.out.println(salaryaftertax);
        double mynumber = tax;
        System.out.println(mynumber);
    }
}
