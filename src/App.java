import java.util.Arrays;
import java.util.regex.Pattern;

/*
    Zadanie
    W przykładowym napisie oblicz ilość wystąpień podanego przez Ciebie wzorca.
*/

public class App {

    static int countPattern(String regex, String text, boolean caseInsensitive) {
        if (regex == null || regex.isEmpty()) {
            throw new IllegalArgumentException("Regex is null or empty");
        }

        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Regex is null or empty");
        }

        var counter = 0;
        var pattern = caseInsensitive ? Pattern.compile(regex, Pattern.CASE_INSENSITIVE) : Pattern.compile(regex);
        var matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            counter++;
        }

        return counter;
    }
    public static void main(String[] args) {
        System.out.println(countPattern("[A-Z]+", "KM Programs KURS JAVA", true));
    }
}
