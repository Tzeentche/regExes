import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        CREDIT CARD

        String cardNumber = "2234567890123456";
        String date = "03/12";
        String CVV = "123";

        Pattern cardNumberPattern = Pattern.compile("([2-6]([0-9](3)) ?)(([0-9](4) ?)(3))");
        Pattern dataPattern = Pattern.compile("(0[1-9]|1[0-2])/([0-9](2))");
        Pattern CVVPattern = Pattern.compile("[0-9](3)");

        Matcher cardNumberMatcher = cardNumberPattern.matcher(cardNumber);
        Matcher dataMatcher = dataPattern.matcher(date);
        Matcher CVVMatcher = CVVPattern.matcher(CVV);

        if(cardNumberMatcher.matches() && dataMatcher.matches() && CVVMatcher.matches()) {
            System.out.println("Card data is correct");
        } else {
            System.out.println("Card data is incorrect");
        }
//        PHONE

//        int counter = 0;
//        String phoneNumber = "+375292690158";
//        Pattern pattern = Pattern.compile("^((\\+?380)([0-9][9]))$");
//        Matcher matcher = pattern.matcher(phoneNumber);
//
//       if (matcher.matches()) {
//            System.out.println("Phone number '" + phoneNumber + "' is correct");
//
//       } else {
//           System.out.println("Phone number '" + phoneNumber + "' is incorrect");
//       }

//        SVERHZHADNAYA

//        int counter = 0;
//
//        String string = "196.198.1.197";
//        Pattern pattern = Pattern.compile(".*+19");
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

//        ZHADNAYA:

//        int counter = 0;
//        String string = "196.198.1.197";
//
//        Pattern pattern = Pattern.compile(".*19");
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
