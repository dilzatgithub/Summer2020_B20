package day51_Exceptions;
class b{
    public b(){
        System.out.println("default constructor");
    }



}
public class superKeyword2 extends b {
    public superKeyword2(){
        System.out.println("sub class's default constructor");

    }

    public static void main(String[] args) {
        new superKeyword2();




    }

}
