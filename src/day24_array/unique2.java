package day24_array;

public class unique2 {
    public static void main(String[] args) {
        String str = "aabccd";
        String result = "";
       for (int j = 0;j<= str.length()-1;j++) {
           char ch = str.charAt(j);
           int count = 0;
           for (int i = 0; i <= str.length() - 1; i++) {
               char each = str.charAt(i);
               if (ch == each) {
                   count += 1;
               }

           }
           if (count == 1){
               result += ch;
           }
       }


        System.out.println(result);
    }
}
