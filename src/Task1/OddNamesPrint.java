package Task1;

import java.io.File;
import java.util.List;
import java.util.stream.IntStream;

public class OddNamesPrint {
    public static void main(String[] args) {
        File file = new File("NameHuman.txt");
        NamesFileReader namesFileReader = new NamesFileReader();
        List<String> namesList = namesFileReader.readNamesFromFile(file);
        IntStream.range(0, namesList.size())
                .filter(i -> i % 2 != 0)
                .forEach(i -> System.out.println(i + ". Name: " + namesList.get(i)));
    }
}