package day46_ConstructorCalls;

public class ConstructorCall3 {
    public ConstructorCall3(){
        System.out.println("X");
    }
    public ConstructorCall3(int a ){
        this();
        System.out.println("Y");
    }
    public ConstructorCall3(double a){
        this(10);
    }

    public static void main(String[] args) {
        new ConstructorCall3(1.1);
    }



}
