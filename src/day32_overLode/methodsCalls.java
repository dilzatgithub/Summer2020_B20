package day32_overLode;
import Library.Util;
public class methodsCalls {
    public static void main(String[] args) {
       String firstName = "dilZAt";
       String lastName = "dilmurat";
       String fullName = Util.formatFullName(firstName,lastName);
       String uniqueName = Util.uniques(fullName);
        System.out.println(uniqueName);
        String reverseName = Util.reverse(fullName);
        System.out.println(reverseName);

    }
}
