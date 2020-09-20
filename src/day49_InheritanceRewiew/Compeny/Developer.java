package day49_InheritanceRewiew.Compeny;

public class Developer extends Employee{
    public Developer(String name, int age, char Gender, double Salary,
                     int ID, String jobTitle){
        setInfo(name,age,Gender,Salary,ID,jobTitle);
    }
    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixBug(){
        System.out.println(name + " is fixing bug");
    }
}
