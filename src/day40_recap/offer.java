package day40_recap;

public class offer {
    double salary;
    String location;
    boolean hasPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean hasBenefit;
    public void setInfo(double salary, String location,boolean hasPTO,boolean isFullTime,
            boolean WFH, String jobTitle, boolean hasBenefit){
        this.salary = salary;
        this.location = location;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }
    public void getInfo(){
        System.out.println("salary is $" + salary);
        System.out.println("Location is "+ location);
        System.out.println("has PTO? " + hasPTO);
        System.out.println("is FullTime? " + isFullTime);
        System.out.println("can work from home? " + WFH);
        System.out.println("Job Title is " + jobTitle);
        System.out.println("does it have benefits? " + hasBenefit);
        System.out.println("**********************************************");
    }

}
