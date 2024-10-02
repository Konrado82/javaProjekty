import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Stwórz HashMapę, która będzie przechowywać państwa oraz ich stolice.
//        Dodaj do niej pięć przykładowych elementów.
//        Pozwól użytkownikowi zapytać o państwo i w odpowiedzi wyświetl stolicę tego państwa.
//        Gdy państwo nie będzie obecne w HashMapie, wyświetl użytkownikowi odpowiedni komunikat.
        HashMap<String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Francja", "Paryż");
        countriesAndCapitals.put("Hiszpania", "Madryt");
        countriesAndCapitals.put("Portugalia", "Porto");

        Scanner scanner = new Scanner(System.in);

        for (String keys: countriesAndCapitals.keySet()){
            System.out.println("Podaj nazwę Państwa");
            String countryName = scanner.nextLine();
            if (countriesAndCapitals.containsKey(countryName)){
                System.out.println(countriesAndCapitals.get(countryName));
                break;
            }else {
                System.out.println("Tego Państwa nbie ma w bazie");
            }
        }
//        Druga wersja

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Podaj nazwę państwa");
//        String answear = scanner.nextLine();
//
//        HashMap<String, String> cAntAndCap = new HashMap<>();
//        cAntAndCap.put("Polska","Warszawa");
//        cAntAndCap.put("Niemcy","Berlin");
//        cAntAndCap.put("Bułgaria","Sofia");
//        cAntAndCap.put("Francja","Paryż");
//        cAntAndCap.put("Włochy","Rzym");
//
//        Set<String> keys = cAntAndCap.keySet();
//
//        for (String key:keys){
//            if (key.equals(answear))
//                System.out.println(cAntAndCap.get(key));
//            }
    }
}