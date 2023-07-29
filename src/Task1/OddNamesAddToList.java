package Task1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OddNamesAddToList {
    public static void main(String[] args) {
        File file = new File("NameHuman.txt");
        NamesFileReader namesFileReader = new NamesFileReader();
        List<String> namesList = namesFileReader.readNamesFromFile(file);
        List<String> oddNames = new ArrayList<>();
        int count = 1;
        for (String name : namesList) {
            if (count % 2 != 0) {
                oddNames.add(name);
            }
            count++;
        }
    }
}
