import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Stwórz program, w którym:
//
//Zapytasz użytkownika, ile imion chce podać.
//Pobierzesz te imiona i zapiszesz je do ArrayListy.
//Wyświetlisz informację, ile jest na liście mężczyzn,
// a ile kobiet, przyjmując że imiona kobiece kończą się na literę "a".


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile imion chcesz podać?");
        int namenumber = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < namenumber; i++) {
            System.out.println("Podaj imię");
            String name = scanner.nextLine();
            names.add(name);
        }
        int women = 0;
        int men = 0;
        for (String name : names) {
            if (name.endsWith("a")) {
                women++;
            } else {
                men++;
            }
        }
        System.out.println("Kobiet jest " + women +"\nMężczyzn jest "+ men );


    }
}