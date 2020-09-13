package day10;

public class grade {
    public static void main(String[] args) {
        double score = 123;
        String Grade = "";
        if(score>=90 && score <= 100){
            Grade = score + " gets A";
        }else if(score<90 && score>= 80){
            Grade = score + " gets B";}
        else if(score<80 && score >= 70){
            Grade = score + " gets C";
        }else if(score< 70 && score >= 60){
            Grade = score +" gets D";
        }else if(score<60 && score >=0 ){
            Grade = score + " gets F";
        }else {
            Grade = score + " you are too smart for Cybertek!!!";
        }
        System.out.println(Grade);

}}
