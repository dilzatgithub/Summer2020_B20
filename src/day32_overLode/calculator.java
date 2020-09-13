package day32_overLode;

public class calculator {
    public static double calculator(double num1,char operator,double num2 ){
        double result =(operator == '+')?num1+num2:(operator == '-')?
                num1-num2:(operator== '*')?num1*num2:(operator=='/')?
                num1/num2:(operator== '%')?num1%num2:0;
        return result;

    }
}
