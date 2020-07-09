import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        ZHADNAYA:

        int counter = 0;
        String string = "196.198.1.197";

        Pattern pattern = Pattern.compile(".*19");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            counter++;
            System.out.println("Matcher found '" +
                    string.substring(matcher.start(), matcher.end()) +
                    "'. Starting at index " + matcher.start() +
                    " and ending at index " + matcher.end());
        }

        System.out.println("Matcher found:" + counter);

//        LAZY
//        int counter = 0;
//        String string = "196.198.1.197";
//        Pattern pattern = Pattern.compile(".*?19");
//        Matcher matcher = pattern.matcher(string);
//
//        while (matcher.find()) {
//            counter++;
//            System.out.println("Matcher found '" +
//                    string.substring(matcher.start(), matcher.end()) +
//                    "'. Starting at index " + matcher.start() +
//                    " and ending at index " + matcher.end());
//        }
//
//        System.out.println("Matcher found:" + counter);

//        Pattern pattern = Pattern.compile();
//
//        Matcher matcher = pattern.matcher();

//        System.out.println(Pattern.compile("20+").matcher("20").find());

//        Pattern pattern = Pattern.compile("Java (?! 7|8)");
//        Matcher matcher1 = pattern.matcher("Java 7 Java 8");
//        Matcher matcher2 = pattern.matcher("Java 9");
//
//        if(!matcher1.find()) System.out.println("Coincidence not found");
//
//        while (matcher2.find()) {
//            System.out.println(matcher2.group());
//        }
//
//
//        Pattern pattern = Pattern.compile("[\\S]");
//
//        Matcher matcher1 = pattern.matcher("a b c d e f g h");
//        System.out.println(matcher1.find());
//
//        Matcher matcher2 = pattern.matcher("f g h a b c");
//        System.out.println(matcher2.find());
//
//        Matcher matcher3 = pattern.matcher("123");
//        System.out.println(matcher3.find());
//
//        Pattern pattern1 = Pattern.compile("[a-z]+");
//
//        Matcher matcher1 = pattern1.matcher("a b c d 1 2 3 4");
//        System.out.println(matcher1.find());
//
//        Matcher matcher2 = pattern1.matcher("A B C D 1 2 3 4");
//        System.out.println(matcher2.find());
//
//        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
//
//        Matcher matcher3 = pattern2.matcher("A B C D a b c d 1 2 3 4");
//        System.out.println(matcher3.find());
    }
}
