package Task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NamesFileReader {

    public List<String> readNamesFromFile(File file) {
        List<String> namesList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            namesList = br.lines()
                    .flatMap(line -> Stream.of(line.trim().split("\\s+")))
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return namesList;
    }
}