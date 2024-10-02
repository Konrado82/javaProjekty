import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Stwórz prostą aplikację umożliwiającą wypożyczanie samochodów.
//        Wykorzystaj do tego HashMapę, w której kluczem będzie nazwa samochodu
//        , a wartością informacja czy samochód jest dostępny do wypożyczenia czy nie.
//        Pozwól użytkownikowi na wyświetlanie wszystkich samochodów
//        (wraz z informacją czy są dostępne czy nie),
//        na wyświetlanie tylko dostępnych samochodów oraz wyświetlanie wypożyczonych przez niego samochodów.
//        Nie pozwól, by użytkownik mógł wypożyczyć więcej niż 3 samochody naraz.
        HashMap<String, String> carList = new HashMap<>();



        carList.put("Audi", "dostepny");
        carList.put("BMW", "dostepny");
        carList.put("Citroen", "dostepny");
        carList.put("Daihatsu", "dostepny");
        carList.put("Ford", "dostepny");
        carList.put("Honda", "dostepny");
        carList.put("Kia", "dostepny");
        carList.put("Vw", "dostepny");
        Set<String> keys = carList.keySet();
        Scanner scanner = new Scanner(System.in);
        String choosen;
        ArrayList<String> mycars3 = new ArrayList<>();

        do {
            System.out.println("podaj opcję");
            choosen = scanner.nextLine();
            switch (choosen){
                case "A"-> {
                    for (String key : keys) {
                        System.out.println(key + "-" + carList.get(key));
                    }
                }
                case "B"-> {
                    for (String key:keys){
                        if (carList.get(key).equals("dostepny"))
                            System.out.println(key+"-"+carList.get(key));
                    }
                }
                case  "C"->{
                    for (String key:keys) {
                        if (carList.get(key).equals("niedostepny"))
                            System.out.println(key+"-"+carList.get(key));
                    }
                }
                case "D"-> {
                    System.out.println("Jakie auto z listy wypożyczasz");
                    String rentACar = scanner.nextLine();
                    if (mycars3.size()==3) {
                        System.out.println("nie możesz wypozyczać");
                    }
                    if (mycars3.size()!=3){
                        for (String key : keys) {
                            carList.get(key).equals(rentACar);
                            carList.replace(rentACar, "niedostepny");
                        }
                        mycars3.add(rentACar);
                    }
                }

                case  "E"->{
                    System.out.println("Jakie auto zwracasz");
                    String getBackCar = scanner.nextLine();
                    for (String key:keys){
                        carList.get(key).equals(getBackCar);
                        carList.replace(getBackCar, "dostepny");
                    }
                    mycars3.remove(getBackCar);
                }
            }

        }while (!choosen.equals("Z"));

    }
}