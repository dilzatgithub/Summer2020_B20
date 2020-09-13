package day41_Static;

import java.text.DecimalFormat;

public class carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    public void setInfo(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double totalPrice = 0;
        totalPrice = (width* length)*unitPrice;
        totalPrice = (isPersian)? totalPrice += 200 : totalPrice;
        return totalPrice;
    }
    public void getInfo(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("width of the carpet is: " + width);
        System.out.println("length of the carpet is: " + length);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("is a persian carpet: " + isPersian);
        System.out.println(df.format(calcCost()));
    }
    public String toString(){
        return "width: " + width + ", length: " + length+ ", Price: " + unitPrice;
    }
}
