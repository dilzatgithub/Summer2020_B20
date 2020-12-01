package day58_polymorphism_Continue.Animal_Task;

public class Dog extends Animal {
    public String dogName;

    public Dog(int age, char gender, String dogName) {
        super(age, gender);
        this.dogName = dogName;
    }
    public void bark(){
        System.out.println(dogName+ " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void eat() {
        System.out.println(dogName +" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(dogName+" is sleeping");
    }
}
