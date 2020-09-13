package day48_Inheritance.animals;

public class animalObj {
    public static void main(String[] args) {
        Dog dog1 = new Dog("tom","mid",2,'F',"German",100);
        dog1.bark();
        System.out.println(dog1);
        cat cat1 = new cat("teemo","large",1,'M',"tebby",20);
        System.out.println(cat1);

    }
}
