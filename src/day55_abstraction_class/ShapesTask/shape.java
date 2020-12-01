package day55_abstraction_class.ShapesTask;

public abstract class shape {
    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();



}
