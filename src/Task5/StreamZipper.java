package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> secondList = second.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        Iterator<T> secondIterator = secondList.iterator();

        Stream.Builder<T> builder = Stream.builder();
        first.forEachOrdered(item -> {
            if (secondIterator.hasNext()) {
                builder.accept(item);
                builder.accept(secondIterator.next());
            }
        });

        return builder.build();
    }
}
