package Tasks7.day7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchStringWithRegex {
    public static void main(String[] args) {
        // Original string
        String str = "The quick brown fox jumps over the lazy dog";

        // Regular expression to match words starting with 't' or 'T'
        String regex = "\\b[Tt]\\w*\\b";

        // Compiling the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Matching the string with the regular expression
        Matcher matcher = pattern.matcher(str);

        // Finding and printing the matched strings
        System.out.println("Words starting with 't' or 'T':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

