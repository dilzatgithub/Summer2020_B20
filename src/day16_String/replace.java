package day16_String;

public class replace {
    public static void main(String[] args) {
        String fly = "Fly me to the moon\n" +
                "Let me play among the stars\n" +
                "Let me see what spring is like\n" +
                "On a, Jupiter and Mars\n" +
                "In other words, hold my hand\n" +
                "In other words, baby, kiss me\n" +
                "Fill my heart with song\n" +
                "And let me sing for ever more\n" +
                "You are all I long for\n" +
                "All I worship and adore\n" +
                "In other words, please be true\n" +
                "In other words, I love you\n" +
                "Fill my heart with song\n" +
                "Let me sing for ever more\n" +
                "You are all I long for\n" +
                "All I worship and adore\n" +
                "In other words, please be true\n" +
                "In other words, in other words\n" +
                "I love you.";
        int n1 = fly.indexOf("I");
        String fly2 = fly.replace("I","Y");
        System.out.println(n1);



    }
}
