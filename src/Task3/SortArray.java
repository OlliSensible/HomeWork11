package Task3;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortArray {

    public static String sortNumbersInArray(String[] args) {
        return Arrays.stream(args)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
