import java.util.Collections;
import java.util.List;

public class App1 {

    static String createMessage(List<String> items) {
        var result = "";
        for (var item : items) {
            /*
                Wielokrotne wykorzystanie operatora += jest operacją o złożoności
                obliczeniowej O(n^2).
                Napisy są niemodyfikowalne i każda próba połączenia dwóch napisów
                kończy się generowaniem nowego napisu.
            */
            result += item;
        }
        return result;
    }

    public static void main(String[] args) {
        var items = Collections.nCopies(1000000, "A");
        System.out.println("==> START");
        var result = createMessage(items);
        System.out.println("==> STOP");
    }
}
