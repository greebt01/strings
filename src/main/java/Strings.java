import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String message = "  C:\nWindows\\...";
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.trim());
        System.out.println(message);
    }
}
