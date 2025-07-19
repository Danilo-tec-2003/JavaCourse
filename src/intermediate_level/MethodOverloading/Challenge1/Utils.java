package intermediate_level.MethodOverloading.Challenge1;

import java.text.NumberFormat;
import java.util.Locale;

public class Utils {

    static void show(String message) {
        System.out.println("INFO: " + message);
    }

    static void show(String message, int level) {
        System.out.println("AVISO NÍVEL " + level + ": " + message);
    }

    static void show (double monetaryValue) {
       NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Valor: " + format.format(monetaryValue));
    }
}
