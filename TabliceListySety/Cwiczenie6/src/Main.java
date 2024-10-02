import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Stwórz aplikację, która będzie pozwalała użytkownikowi na dodawanie, usuwanie oraz wyświetlanie imion z listy.
//        \W przypadku, gdy imię do usunięcia będzie obecne na liście wielokrotnie, usuń wszystkie wystąpienia.
//        Aplikacja powinna działać do momentu, gdy użytkownik nie wybierze opcji kończącej działanie aplikacji.
        Scanner scanner = new Scanner(System.in);
        String choosenX;
        String tekst = """
                Wybierz co chcerz zrobić
                Dodaj imie do listy: wcisnij D
                Usuń imię: wcisnij U
                Wyswietl imię: wcisnij W
                Wyswietl całą liste: wcisnij C
                Zakończ działanie programu: wcisnij Z""";
        ArrayList<String> names = new ArrayList<>();

        do {


            System.out.println(tekst);
            choosenX = scanner.nextLine();


            switch (choosenX) {
                case "D" -> {
                    System.out.println("podaj imię");
                    String name = scanner.nextLine();
                    names.add(name);
                }
                case "U" -> {
                    System.out.println("podaj imie do usunięcia");
                    String name = scanner.nextLine();
                    boolean flag = false;
                    do {
                        flag = false;
                        for (String Uname : names) {
                            if (name.equals(Uname)) flag = true;
                        }

                        if (flag) names.remove(name);


                    } while (flag);
                }



                case "W" -> {
                    System.out.println("Podaj imie które chcesz znależć");
                    String name = scanner.nextLine();
                    if (names.contains(name)) {
                        System.out.println("To imie jest na liscie");
                    } else {
                        System.out.println("Tego imienia nie ma na liscie");
                    }

                }
                case "C"-> {
                    for (String name : names){
                        System.out.println(name);
                    }
                }


            }

        } while (!choosenX.equals("Z"));


    }
}