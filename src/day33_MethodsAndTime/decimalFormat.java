package day33_MethodsAndTime;

import java.text.DecimalFormat;

public class decimalFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double a = 22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));
    }
}
