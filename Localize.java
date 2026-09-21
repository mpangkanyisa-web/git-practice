import java.util.Arrays;
import java.util.Locale;

public class Localize {
    public static void main(String[] args) {

    // Locale[] availLocales = Locale.getAvailableLocales();

    //     System.out.println(Arrays.toString(availLocales));
        
    // Locale primaryDefault = Locale.getDefault();
    // System.out.println(primaryDefault);

    // Locale displayLocale = Locale.getDefault(Locale.Category.DISPLAY, Locale.FRENCH);
    // System.out.println(displayLocale);
    // Locale formatLocale = Locale.getDefault(Locale.Category.FORMAT, Locale.UK);
    // System.out.println(formatLocale);


    // // ResourceBundle bundle = ResourceBundle.getBundle("Labels", Locale.ENGLISH);// This is the built-in one
    //Locale zaLocale = Locale.of("en", "ZA"); // if you wanta custom one for your country South Africa, you build it yourself.

    Locale resolvedLocale = bundle.getLocale(); 
    System.out.println(resolvedLocale);
    
    }
}
