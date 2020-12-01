package day55_abstraction_class.ShapesTask;

public final class Cylinder extends shape {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();

    }

    @Override
    public double calculateArea() {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }
    static {
        hasVolume = true;
        name = "Cylinder";
    }
}
