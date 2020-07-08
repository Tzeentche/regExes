import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern pattern1 = Pattern.compile("[a-z]+");

        Matcher matcher1 = pattern1.matcher("a b c d 1 2 3 4");
        System.out.println(matcher1.find());

        Matcher matcher2 = pattern1.matcher("A B C D 1 2 3 4");
        System.out.println(matcher2.find());

        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");

        Matcher matcher3 = pattern2.matcher("A B C D a b c d 1 2 3 4");
        System.out.println(matcher3.find());
    }
}
