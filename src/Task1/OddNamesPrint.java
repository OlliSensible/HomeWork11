package Task1;

import java.io.File;
import java.util.List;

public class OddNamesPrint {
    public static void main(String[] args) {
        File file = new File("NameHuman.txt");
        NamesFileReader namesFileReader = new NamesFileReader();
        List<String> namesList = namesFileReader.readNamesFromFile(file);
        int count = 1;
        for (String name : namesList) {
            if (count % 2 != 0) {
                System.out.println(count + ". Name: " + name);
            }
            count++;
        }
    }
}
