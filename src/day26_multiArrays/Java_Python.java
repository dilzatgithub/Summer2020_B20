package day26_multiArrays;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java Python Python Python Python  ";
        String[] words = sentence.split(" ");
        int countJava = 0;
        int countPython = 0;
        for (String each: words){
            if (each.toLowerCase().contains("java")){
                countJava++;
            }else if (each.toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);





    }
}
