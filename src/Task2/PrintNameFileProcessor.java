package Task2;

import java.util.List;

public class PrintNameFileProcessor {
    public static void main(String[] args) {
        NameFileProcessor processor = new NameFileProcessor();
        String filename = "NameHuman.txt";
        List<String> sortedNames = processor.processNamesFile(filename);

        if (sortedNames != null) {
            System.out.println("The sorted list of names in uppercase (in descending order):");
            sortedNames.forEach(System.out::println);
        }
    }
}
