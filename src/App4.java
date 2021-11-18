import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class App4 {
    public static void main(String[] args) {
        var items = List.of("A", "B", "C");

        var result1 = String.join("...", items);
        System.out.println(result1);

        var sj = new StringJoiner("...");
        items.forEach(item -> sj.add(item));
        var result2 = sj.toString();
        System.out.println(result2);

        var result3 = items
                .stream()
                .map(String::toLowerCase)
                .collect(Collectors.joining("..."));
        System.out.println(result3);
    }
}
