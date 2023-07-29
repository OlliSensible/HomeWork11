package Task4;

import java.util.stream.Stream;

public class RandomStreamGenerator {
    public static Stream<Long> randomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

}
