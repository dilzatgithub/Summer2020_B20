package day29_customMethods;

public class returnKeyword {
    public static void main(String[] args) {
        grade(100);

    }
    public static void grade(double score){
        if (score<0 || score>100){
            System.out.println("invalid");
            return;
        }
        char grade = (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':
        (score>=60)?'D':'F';
        System.out.println(grade);
    }
}
