import java.util.Collections;
import java.util.List;

public class App2 {
    static String createMessage(List<String> items) {
        /*
            Kiedy musisz połączyć bardzo dużo napisów w jeden napis zastosuj
            StringBuilder. Możesz określić początkowy rozmiar tablicy używanej
            do przechowywania znaków w obiekcie StringBuilder, co jeszcze
            bardziej przyśpieszy działanie StringBuilder-a.

            WNIOSEK:
            Z operatora += korzystaj tylko wtedy, kiedy musisz połączyć niewielką
            ilość napisów.
        */
        var result = new StringBuilder(items.size() * 100);
        System.out.println("Length   = " + result.length());
        System.out.println("Capacity = " + result.capacity());

        items.forEach(item -> result.append(item));
        // items.forEach(result::append);
        return result.toString();
    }

    public static void main(String[] args) {
        var items = Collections.nCopies(1000000, "A");
        System.out.println("==> START");
        var result = createMessage(items);
        System.out.println("==> STOP");
    }
}
