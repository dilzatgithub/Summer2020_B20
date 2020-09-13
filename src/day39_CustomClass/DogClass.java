package day39_CustomClass;

public class DogClass {
    String breed;
    String size;
    int age;
    String color;
    public void setInFo(String dogBreed,String dogSize, int dogAge,String dogColor){
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    }
    public void getInFo(){
        System.out.println("my new dog is "+ breed+" "+size+" "+age+"years old, "+ color+" dog.");
    }



}
