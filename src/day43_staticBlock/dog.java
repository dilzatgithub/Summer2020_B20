package day43_staticBlock;

class test {
    String name;
    int age;
    public void setInfo(String name, int age){
        name = name;
        age = age;

    }
}
public class dog{
    public static void main(String[] args) {
        test obj1 = new test();
        obj1.setInfo("luck", 4);
        System.out.println(obj1.name+" : "+ obj1.age);

    }
}
