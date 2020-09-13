package day46_ConstructorCalls;

public class ConstructorCall2 {
    public ConstructorCall2(){
        System.out.println("a");

    }
    public ConstructorCall2(int a){
        this();
        System.out.println("b");
    }
    public ConstructorCall2(String str ){
        this(3);
        System.out.println("c");
    }
    public ConstructorCall2(char a  ){
        this();
        System.out.println("d");
    }

    public static void main(String[] args) {
        new ConstructorCall2('a');

    }


}
