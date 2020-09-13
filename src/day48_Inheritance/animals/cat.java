package day48_Inheritance.animals;

public class cat  extends Animal{
    public cat(String name, String size, int age, char gender,String breed,double weight) {
        setInfo(name,size,age,gender,breed,weight);
    }
    public void meow(){
        System.out.println(name+" is meowing");
    }





}
