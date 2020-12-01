package day58_polymorphism_Continue;

import day58_polymorphism_Continue.Animal_Task.Animal;
import day58_polymorphism_Continue.Animal_Task.Cat;
import day58_polymorphism_Continue.Animal_Task.Dog;

public class instanceOf_Keyword {
    public static void main(String[] args) {
        Animal animal1 = new Animal(10,'F');
        Animal animal2 = new Dog(4,'M',"winston");
        Animal animal3 = new Cat(2,'m',"kiko");
        boolean r1 = animal3 instanceof Animal;
        System.out.println(r1);
        boolean r2 = animal3 instanceof Cat;
        System.out.println(r2);
        boolean r3 = animal3 instanceof Dog;
        System.out.println(r3);




    }
}
