package day41_Static;

public class developer {
    String name;
    double salary;
    String gender;
    int age;
    public void set(String name, double salary, int age){
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.gender = gender;
    }
    public void coding(){
        System.out.println(name + "is coding");
    }
    public void fix(){
        System.out.println(name + "is crying");
    }
}
class developerObject{
    public static void main(String[] args) {

    }
}
