package day58_polymorphism_Continue.Animal_Task;

public class Animal {
    public int age;
    public char gender;

    public Animal(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
        System.out.println("animal is eating");
    }
    public void sleep(){
        System.out.println("animal is sleeping");
    }

    @Override
    public String toString() {
        return "animal{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
