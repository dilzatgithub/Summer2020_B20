package day49_InheritanceRewiew.Compeny;

public class Person {
    public String name;
    public int age;
    public char Gender;
    private long ssn;

    public long getSsn() {
        return ssn;
    }
    public void setSsn(long ssn){
        this.ssn = ssn;
    }

    public void setInfo(String name, int age, char Gender){
        this.age = age;
        this.Gender = Gender;
        this.name = name;
    }
    //why private?
    //we don't want this to be inherited
    private void eat(){
        System.out.println(name + " is eating");
    }
    private void walk(){
        System.out.println(name + " is walking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
