package day58_polymorphism_Continue.Animal_Task;

public class Cat extends Animal {
    public String catName;

    public Cat(int age, char gender, String catName) {
        super(age, gender);
        this.catName = catName;
    }
    public void scratch(){
        System.out.println(catName+" is scratching");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
