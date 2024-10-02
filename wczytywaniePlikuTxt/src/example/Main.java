package example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/input_names.txt");
        Path path1 = Paths.get("src/output_names.txt");
        List<String> nameStarsWithA = new ArrayList<>();

        try {
            List<String> pathlines = Files.readAllLines(path);

            for ( String line:pathlines){
                if (line.startsWith("A")){
                    nameStarsWithA.add(line);
                }
            }

        } catch (IOException e) {
            System.out.println("bŁędna nazwa plilu wejsciowego");
            throw new RuntimeException(e);
        }
        try {
            Files.write(path1,nameStarsWithA);
        } catch (IOException e) {
            System.out.println("bŁędn podczas przetwarzania");
            throw new RuntimeException(e);
        }
    }
}