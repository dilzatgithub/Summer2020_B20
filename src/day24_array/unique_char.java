package day24_array;

public class unique_char {
    public static void main(String[] args) {
        String str = "aabccd";
        String unique = "";
        String result = "";
        for (int i = 0;i<=str.length()-1;i++){
            char ch =str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);
            if (first == last ){
                unique += ch;

            }


        }


        System.out.println(unique);


    }
}
