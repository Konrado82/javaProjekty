import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //HASHMAPA
        HashMap<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Hiszpania", "Madryt");

//        System.out.println(countriesAndCapitals.get("Polska"));
//        System.out.println(countriesAndCapitals.containsValue("Berlin"));

        Set<String> keys = countriesAndCapitals.keySet();

//        for (String key : keys){
//            System.out.println(countriesAndCapitals.get(key));
//        }
        for (String key : keys) {
            System.out.println(key + " - " + countriesAndCapitals.get(key));
        }


//TABLICA I PĘTLA EACH
//        String name1 = "ola";
//        String name2 = "ala";
//        String name3 = "ela";

//        String[] guests = new String[]{name1, name2, name3}; //lub = new String[3]
//        i dalej guests [0] = name1; itd
//        System.out.println(guests.length);

//        for (int i=0; i< guests.length; i++){
//            System.out.println(guests[i]);
//    }
//       guests[0]="Kamil"; zamiana w tabeli

//        for (String quest : guests) {
//            System.out.println(quest);
//        }
//ARRAYLIST
//        String name1 = "ola";
//        String name2 = "ala";
//        String name3 = "ela";



//        ArrayList<String> guests = new ArrayList<>();
//        guests.add(name1);
//        guests.add(name2);
//        guests.add(name3);
//        guests.remove(name1);
//        System.out.println(guests.contains("ola"));
//        System.out.println(guests.size()); wielkosc listy


//        for (String guest : guests){
//            System.out.println(guest);
//        }
//        System.out.println(guests.get(0)); //pobieramy element w indeksie 0
//        guests.clear();
//        pozwala na duplikaty w liscie
//HASH SET
//        HashSet<String> guests = new HashSet<>();
//        guests.add(name1);
//        guests.add(name2);
//        guests.add(name3);
//
//        guests.remove("ala");
//
//
//        for (String guest : guests){
//            System.out.println(guest);

//        }
    }
}