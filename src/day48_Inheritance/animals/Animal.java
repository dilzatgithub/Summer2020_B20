package day48_Inheritance.animals;

public class Animal {
    public String name;
    public String size;
    public int age;
    public char gender;
    public String breed;
    public double weight;

    public void setInfo(String name, String size, int age, char gender,String breed,double weight) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.weight = weight;

    }

    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public String toString(){
        return "Name: "+ name+","+ "Age: " + age+","+ "Gender: " + gender+", breed: "+ breed
                +", weight: " + weight;
    }
}
