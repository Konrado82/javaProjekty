import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

                Scanner scanner = new Scanner(System.in);
                List<String> toDoList = new ArrayList<>();
                int choosenNumber;
                Path path = Paths.get("src/listaToDo.txt");
                List<String> lineList = Files.readAllLines(path);
                toDoList.addAll(lineList);



                String tekst=("""
                1 - WyŚwietl wszystkie pozycje z listy
                2 - dodaj nową pozycję do listy
                3 - usun pozycję z listy
                4-  zapis do pliku i zakończenie programu""");



                do {
                    System.out.println(tekst);
                    choosenNumber = Integer.parseInt(scanner.nextLine());
                    int licznik=-1;


                    switch (choosenNumber) {
                        case 1 -> {
                            for (String item : toDoList) {
                                licznik+=1;
                                System.out.println(licznik +" "+ item);

                            }
                        }
                        case 2 -> {
                            System.out.println("Podaj zadanie do wykonania");
                            String element = scanner.nextLine();
                            toDoList.add(element);
                        }
                        case 3 -> {
                            System.out.println("Podaj, którą pozycję chcesz usunąć");
                            int y = Integer.parseInt(scanner.nextLine());
                            toDoList.remove(y);
                        }
                    }

                } while (choosenNumber!=4);
        Files.write(path, toDoList, StandardOpenOption.WRITE,StandardOpenOption.TRUNCATE_EXISTING);

    }
}

