import java.util.Locale;
import java.util.ResourceBundle;

public class Localize {
    public static void main(String[] args) {
    ResourceBundle bundle = ResourceBundle.getBundle("Labels", Locale.ENGLISH);
    Locale resolvedLocale = bundle.getLocale(); 
    System.out.println(resolvedLocale);

    }
}
