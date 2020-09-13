package day14_Scanner;

import java.util.Scanner;

public class Scanner_score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your score:");
        double score = input.nextDouble();
        input.close();
        String result = (score <= 100 && score >90)?"Excellent":(score<=90 && score
        >80)?"Great":(score<=80 && score> 70)?"Good":(score<= 70 && score>=60)?"Pass"
                :(score<60&&score>=0)?"not pass":"invalid score";
        System.out.println(result);







    }
}
