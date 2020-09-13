package day48_Inheritance.animals;

public class Dog extends Animal {
    public void bark(){
        System.out.println(name+ " is barking");
    }

    public Dog(String name, String size, int age, char gender,String breed,double weight) {
        setInfo(name,size,age,gender,breed,weight);
    }
}
