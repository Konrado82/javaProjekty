import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/dane.csv");
        List<String> stringList = Files.readAllLines(path);

        for (String line:stringList){
            String[] split = line.split(";");
            System.out.println("Imię: "+ split[0]);
            System.out.println("Nazwisko: "+ split[1]);
            System.out.println("miasto: "+ split[2]);
        }
    }
}