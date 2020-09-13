package day42_static;

public class circle {
    double radius;
    double diameter;
    static double pi = 3.14;
    public void setInfo(double radius){
        this.radius = radius;
        diameter = radius *2;
    }
    public double calcArea(){
        return radius *  radius *pi;
    }
    public double calcPerimeter(){
        return diameter *pi;
    }
    public String toString(){
        return "the area of the circle with area radius of " + radius+ " is: " + calcArea();
    }

}
