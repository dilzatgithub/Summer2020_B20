package day44_Constructor;

public class student {
    String name;
    int age;
    char gender;
    static String school = "CybertekSchool";
    public student(String name,int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println();
    }
    public String toString(){
        return name+" : " + age + school;
    }
}
