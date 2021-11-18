import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) {
        var items = Collections.nCopies(1000000, "A");

        System.out.println("==> START 1");
        var result1 = String.join("...", items);
        System.out.println("==> STOP 1");

        System.out.println("==> START 2");
        var sj = new StringJoiner("...");
        items.forEach(item -> sj.add(item));
        var result2 = sj.toString();
        System.out.println("==> STOP 2");

        System.out.println("==> START 3");
        var result3 = items
                .stream()
                .map(String::toLowerCase)
                .collect(Collectors.joining("..."));
        System.out.println("==> STOP 3");

    }
}
