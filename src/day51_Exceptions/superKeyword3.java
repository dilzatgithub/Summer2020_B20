package day51_Exceptions;
class c{
    public c(int a){
        System.out.println("super class com");
    }
}
public class superKeyword3 extends c{
    public superKeyword3(){
        super(4);
        System.out.println("sub con with int ");
    }

    public static void main(String[] args) {
        new superKeyword3();
    }
}
