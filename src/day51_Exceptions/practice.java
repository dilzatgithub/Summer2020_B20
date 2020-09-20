package day51_Exceptions;
class x{
    public x(){
        System.out.println("x");
    }
}
class y extends x{
    public y(){
        System.out.println("y");
    }
}
class z extends y{
    public z(){
        System.out.println("z");
    }
}
public class practice {
    public static void main(String[] args) {

        new z();


    }
}
