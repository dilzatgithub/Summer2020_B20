package day55_abstraction_class.ShapesTask;

public class Circle extends shape {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    public  double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    };
    public double calculatePerimeter(){
        return radius*2*Math.PI;
    };
    public double calculateVolume(){
        return 0;
    };
    static {
        name ="circle";
        hasVolume = false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
