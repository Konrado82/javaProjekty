import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Stwórz ArrayListę i dodaj do niej dziesięć imion. Pozwól użytkownikowi zapytać o wybrane imię.
//       Jeżeli zostanie znalezione, wyświetl użytkownikowi indeks lub indeksy, pod którym
//       / którymi znajduje się dane imię. Jeżeli imię nie zostanie znalezione, również wyświetl odpowiednią informację.

        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Ala");
        names.add("Baasia");
        names.add("Bolek");
        names.add("Zbych");
        names.add("Mario");
        names.add("Lech");
        names.add("Waldek");
        names.add("Wojtek");
        names.add("Robercik");

        Scanner scanner = new Scanner(System.in);

        
        for (String checkname : names){
            System.out.println("Podaj imię");
            String name = scanner.nextLine();

            for (int i =0; i<names.size(); i++)
                if (names.contains(name)){
                    System.out.println("indeks pod którym znajduje się to imie to:" + names.indexOf(name) );
                    break;
                }else {
                    System.out.println("nie ma takiego imienia");
                    break;
                }
        }
    }
}