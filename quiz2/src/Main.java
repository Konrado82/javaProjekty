import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src/quiz2");
        List<String> lines = Files.readAllLines(path);
        int points = 0;
        for (String line : lines){
            String[] qAndA = line.split(";");
            System.out.println(qAndA[0]);
            System.out.println("1."+ qAndA[1]);
            System.out.println("2."+ qAndA[2]);
            System.out.println("3."+ qAndA[3]);
            System.out.println();
            System.out.println("Którą odpowiedz wybierasz");
            int answer = scanner.nextInt();

            if (answer ==Integer.parseInt(qAndA[4])){
                System.out.println("Good");
                points++;
            }else {
                System.out.println("Not good");
                int correktAnswer = Integer.parseInt(qAndA[4]);
                System.out.println("Prawidłowa odp to:"+ correktAnswer +"-"+qAndA[correktAnswer]);

            }
            System.out.println("Suma punktów"+ points);


        }
    }
}