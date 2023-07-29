package Task4;

import java.util.stream.Stream;

import static Task4.RandomStreamGenerator.randomStream;

public class PrintRandomStreamGenerator {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (1L << 48);

        Stream<Long> randomStream = randomStream(0L, a, c, m);

        randomStream.limit(10).forEach(System.out::println);
    }
}
