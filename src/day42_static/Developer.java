package day42_static;

public class Developer {
    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender ;
    public void setInfo(String name, long employeeID, String jobTitle, double salary, char gender){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }
    public void coding(){
        System.out.println(name + " is coding");
    }
    public  void fixBug(){
        System.out.println(name + " is fixing bug");
    }
    public String toString(){
        return "name: "+ name + ", Gender: " + gender + ", job title: " + jobTitle+
                ", salary: " + salary+ ", employee ID: " + employeeID;
    }
}
