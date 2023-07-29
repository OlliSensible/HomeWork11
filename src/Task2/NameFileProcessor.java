package Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class NameFileProcessor {
    public List<String> processNamesFile(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));

            List<String> sortedNames = lines.stream()
                    .map(String::toUpperCase)
                    .sorted((name1, name2) -> name2.compareTo(name1))
                    .collect(Collectors.toList());

            return sortedNames;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}

